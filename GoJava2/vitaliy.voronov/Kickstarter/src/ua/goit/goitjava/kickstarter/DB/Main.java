package ua.goit.goitjava.kickstarter.DB;

import ua.goit.goitjava.kickstarter.Controller.Controller;

public class Main {
public static void main(String[] args) {
		
		Controller control = new Controller();
		control.showQuote();
		
		while (true) {
			control.showAllCategories();	
			int x;
			x = control.scanInt();
			if(x == 0){
				break;
			}
			while(true){
				if(x == 0){
					break;
				}				
				control.showCategoryByID(x);
				control.showProjectByCategory(x);
				control.showZero();
				int z = control.scanInt();
				while(true){
					if(x == 0){
						break;
					}
					    control.showSelectProject(z, x);
						control.showZero();
						System.out.println("1) Ask a question\n2) Invest money\n3) Choose a prize for investing");
						int y = control.scanInt();
						switch (y){
						case 1:
							System.out.println("������� ������");
							String s = control.scanString();
							break;
						case 2:
							System.out.println("������� ���");
							String sOs = control.scanString();
							System.out.println("������� � �����");
							String gyGY = control.scanString();
							System.out.println("������� �����");
							int sum = control.scanInt();
							control.addMoney(sum);
							break;
						case 3:
							control.showGiftsMenu();
							int choise = control.scanInt();
							switch(choise){
							case 1:
								control.addMoney(10);
								control.updateProject();
								System.out.println("Thank you");
								break;
							case 2:
								control.addMoney(100);
								control.updateProject();
								System.out.println("Thank you very mach");
								break;
							case 3:
								control.addMoney(1000);
								control.updateProject();
								System.out.println("Thank you very very mach");
								break;
							case 4:
								System.out.println("Your Chupa Chups, we will send by Ukrpochta :)");
								control.addMoney(100000);
								control.updateProject();
								break;
							}
						break;
							
						}
					} 
				}
			}				
		}
}
