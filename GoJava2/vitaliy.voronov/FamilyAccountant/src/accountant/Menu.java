package accountant;

import java.util.Scanner;

public class Menu {
	public void ask(){
		System.out.println("�������� ��������:\n 1- ������ \n 2- ����� \n 3- � ���� ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		switch (a){
			case (1):
				RecordList.addList();
			break;
			case (2):
				
			break;
		}
	}
}
