package accountant;

public class Menu {
	public void ask(){
		System.out.println("�������� ��������:\n 1-������ ������ \n 2- ������ ����� \n 3- ������� ������ ");
		Input input = new Input();
		int a = input.choise();
		switch (a){
			case (1):
				RecordList.addList();
				break;
			case (2):
				Budget.getSum();
				break;
			
			case (3):
				RecordList.output();
				break;	
		}
	}
}
