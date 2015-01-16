/**
 * 
 */
package ua.com.goit.gojava.alex_kholmov;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * @author Alex Kholmov
 *
 */
public class MainMenu {
    //main menu
    static Map<Integer, String> mMenu = new HashMap<Integer, String>();

    public MainMenu() {
        mMenu.put(1, "������ ������� ������");
        mMenu.put(2, "������ ������ ������");
        mMenu.put(3, "������ �����������");
        mMenu.put(4, "������ ���������");
        mMenu.put(0, "�����");
    }
    
    //draw menu
    public static void drawMenu() {
        System.out.println("----------MENU----------");
        for (Map.Entry entry : mMenu.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }
        System.out.println("------------------------");
    }
    
    //read menu point from user
    public static int menuPoint() {
        Scanner scan = new Scanner(System.in);
        System.out.print("�������� ��� �������: ");
        if (scan.hasNextInt()) {
            return scan.nextInt();
        } else {
            System.out.println("������� �����");
            return 0;
        }
    }
    
    //check menu value
    public static void chooseResPoint(int mPoint) {
        switch (mPoint) {
        case 1:
            CalcTighteningDEBolts.printCalcType(mPoint);
            break;
        case 2:
            CalcBoltThreads.printCalcType(mPoint);
            break;
        case 3:
            CalcBearings.printCalcType(mPoint);
            break;
        case 4:
            CalcManifolds.printCalcType(mPoint);
            break;
        case 0:
            System.exit(0);
            break;
        default:
            System.out.print("\n����� ����� ����������� � ����");
            System.exit(0);
            break;
        }
    }
}
