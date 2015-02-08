package ua.com.goit.gojava1.lslayer.hackit2;

import static org.junit.Assert.*;

import org.junit.Test;

import ua.com.goit.gojava1.lslayer.hackit2.action.Action;
import ua.com.goit.gojava1.lslayer.hackit2.action.ScanAction;
import ua.com.goit.gojava1.lslayer.hackit2.actor.Actor;
import ua.com.goit.gojava1.lslayer.hackit2.actor.HumanControlledCharacter;
import ua.com.goit.gojava1.lslayer.hackit2.dto.ActionResult;
import ua.com.goit.gojava1.lslayer.hackit2.dto.ParameterObject;
import ua.com.goit.gojava1.lslayer.hackit2.gear.Gear;
import ua.com.goit.gojava1.lslayer.hackit2.gear.hardware.Devices.BombDevice;
import ua.com.goit.gojava1.lslayer.hackit2.gear.hardware.Devices.ScanDevice;

public class ScanDeviceTest {
    @Test
    public void testCreation() throws Exception {
        ScanDevice scanner = new ScanDevice("Vizor3000");
        assertEquals("Vizor3000", scanner.getName());
    }
    @Test
    public void testViewOfScanner() throws Exception {
        ScanDevice scanner = new ScanDevice("Vizor3000");
        try {
            scanner.addPurpose("scan", 100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String eol = System.getProperty("line.separator");
        assertEquals("Vizor3000", scanner.getStringForOutput());
        scanner.addParameter("cpu", 100);
        assertEquals("Vizor3000"+ eol +"cpu: 100", scanner.getStringForOutput());
    }
    @Test
    public void testUseOfDeviceWrongWay() throws Exception {
        //Init section
        ParameterObject po = new ParameterObject();
        Actor actor = new HumanControlledCharacter("MegaPihar");
        actor.addSkill("scan");
        Gear scanner = new ScanDevice("ScanMaster22000").addPurpose("scan", 100);
        Action action = new ScanAction();
        //Use section
        ActionResult result = action.execute(po);
        assertFalse(result.isSuccess());
        assertEquals("A person needed to scan", result.getResultMessage());

        po.actor = actor;
        result = action.execute(po);
        assertFalse(result.isSuccess());
        assertEquals("A tool needed to scan", result.getResultMessage());

        po.tool = scanner;
        result = action.execute(po);
        assertFalse(result.isSuccess());
        assertEquals("A target needed to scan", result.getResultMessage());
        
    }
    @Test
    public void testUseOfDeviceRightWay() throws Exception {
        ParameterObject po = new ParameterObject();
        Actor actor = new HumanControlledCharacter("MegaPihar");
        actor.addSkill("scan");
        Gear scanner = new ScanDevice("ScanMaster22000").addPurpose("scan", 100);
        Action action = new ScanAction();
        Gear target = new ScanDevice("WTF");
        Gear unscannableTarget = new ScanDevice("You can't see my name").addPurpose("scan", 10000);
        try {
            @SuppressWarnings("unused")
            Gear failedCreation = new BombDevice("BombMaster").addPurpose(null, 0);
        } catch (Exception e) {
            assertEquals("No null purpose allowed", e.getMessage());
        }
        Gear scannerWithotScanPurpose = new BombDevice("BombMaster");
        po.actor = actor;
        po.tool = scanner;
        po.targetGear = target;

        ActionResult result = action.execute(po);
        assertTrue(result.isSuccess());
        assertEquals("You successfully scanned "+ target.getName()+". Got new information", result.getResultMessage());
      
        po.targetGear = unscannableTarget;
        result = action.execute(po);
        assertFalse(result.isSuccess());
        assertEquals("Unsuccesful scan. You got no new information", result.getResultMessage());
        
        po.targetGear = target;
        po.tool = scannerWithotScanPurpose;
        result = action.execute(po);
        assertFalse(result.isSuccess());
        assertEquals("Your " + scannerWithotScanPurpose.getName() + " can't scan", result.getResultMessage());
    }
}