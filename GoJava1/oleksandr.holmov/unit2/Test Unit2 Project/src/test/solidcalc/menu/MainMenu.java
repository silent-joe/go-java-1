/**
 * 
 */
package test.solidcalc.menu;

import java.util.HashMap;
import java.util.Map;

/**
 * @author SASH
 *
 */
public class MainMenu extends Menu {
    
    public Map<Integer, String> menuData = new HashMap<Integer, String>();
    
    public MainMenu() {
        menuData.put(0, "�����");
        menuData.put(1, "������ ������� ������");
        menuData.put(2, "������ ������");
        menuData.put(3, "������ �����������");
    }
   
}
