package gojava;

import java.util.InputMismatchException;

public class Menu {
	private IO io;
	
	public Menu(IO io){
		this.io=io;
	}
	
//	public void run(){
//		io.out(tempProject.showProject());
//		
//		int choice = menuInputCheck(int length);
//		if(choice==0){break;}
//		
//		inProjectMenu(tempProject, choice);
//	}

	public int menuInputCheck(int length){
		try{
			int choice=io.input();
			if (choice<0||choice>length){
				io.out("Wrong input!!!\nChoose again!");
				return menuInputCheck(length);
			}else{
				return choice;
			}
		} catch(InputMismatchException ex){
			io.out("Wrong input!!!\nChoose again!");
			return menuInputCheck(length);
		}
	}
	
	public String stringInputCheck(){
		String input = io.stringInput();
		if (input.equals("")){
			io.out("Wrong input!!!\nType again!");
			return stringInputCheck();
		}else if(input.equals("0")){
			return "0";
		}else{
			return input;
		}
	}

	public String cardInputCheck() {
		String input = io.stringInput();
		if(input.equals("0")){
			return "0";
		}else if (input.equals("")||input.length()<16){
			io.out("Wrong card number!!!\nType again!");
			return cardInputCheck();
		}else{
			return input;
		}
	}
	
}
