//package mainkick;
//
//import java.io.IOException;
//
//public class Menu {
//	private InputsConsole choice;
//	private OutputConsole out;
//	
//	public Menu(InputsConsole choice, OutputConsole out){
//		this.choice = choice;
//		this.out = out;
//	}
//	
//	InputChecker check = new InputChecker(new InputsConsole(), new OutputConsole());
//	
//	private int menu;
//	private int chosen;
//	
//	private void menu(){
//		selectionBorder();
//		
//		print();
//		
//		ask();
//		
//		if (sleep(chosenProject)){switcher();}
//		
//		condition();
//		
//		menu = menuProject;
//		switcher();
//	}
//	
//	private void selectionBorder() {
////		int[] intSwitch = {menuCategories};
//	}
//
//	private void print() {
////		printProjects();
//	}
//	
//	private void ask() {
////		askProject(intSwitch);
//	}
//	
//	private void condition() {
////		if (compare(intSwitch, chosenProject)) {menu = menuCategories; switcher();}
//		
//	}
//	
//	private void switcher(){
////		switch(menu){
////			case 222: categories(); break;
////			case 333: projects(); break;
////			case 444: project(); break;
////			case 555: payment(); break;
////			case 666: question(); break;
////		}
//	}
//	
//	private Boolean sleep(int m){
//		Boolean b = false;
//		if (m == 777){					//TODO
//			try {
//				Thread.sleep(10000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			b = true;
//		}
//		return b;
//	}
//
//}