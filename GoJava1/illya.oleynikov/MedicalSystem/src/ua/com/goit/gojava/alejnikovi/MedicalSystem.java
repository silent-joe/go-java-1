package ua.com.goit.gojava.alejnikovi;

import java.util.*;

public class MedicalSystem {
		
	public static void main(String[] args) {
		
		ArrayList<Object> doctors = new ArrayList<Object>();
		int choose = 0;
		
		while (choose != 3) try {
			System.out.println("������ ������� ����� (1) ��� ����������� ������(2). 3 - ��� ������");
			choose = Integer.parseInt(Doctor.input());
			if (choose == 1){
				doctors.add(new Doctor());
			} else if (choose == 2){
				System.out.println("���������� ������ � ���� - " + doctors.size());
			} 
		} catch (NumberFormatException e){
			System.err.println("�� ������ ������ ����� 1, 2 ��� 3");
		}
		
		for (int i = 0; i < doctors.size(); i++){						//TODO: ������� � �����
			System.out.println(((Doctor) doctors.get(i)).getSpec());
		}
				 						
	}
	
}
