package kickstarter;

import java.util.Scanner;

public class Engine {
	private Scanner scan;

	public void choiceCategory(){
		while (true){
		scan = new Scanner(System.in);
		int i = scan.nextInt();
		if (i == 1){
			System.out.println("��� �� ������� �����!");
		} else{
			if (i == 2){
				System.out.println("��� �� ������� ������!");
			} else{
				if (i == 3){
					System.out.println("��� �� ������� �������!");
				} else {
					System.out.println("����� ��������� �� ����������! ��������, ����������, ������ �� ���� �������������!");
				}
			}
		}
	}
	}

}
