package ua.com.goit.gojava.alejnikovi;

import java.util.*;

public class Doctor {
	
	String name;
	String surname;
	String specialization;

	Doctor (){
		System.out.println("������� ��� ������ �������");
		name = input();
		System.out.println("������� ������� ������ �������");
		surname = input();
		System.out.println("������� ������������� ������ �������");
		specialization = input();
		System.out.println("�������! �������� ����� ������: " + name + " " + surname + " " + specialization);
		System.out.println();
	}
	
	public static String input(){
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	public String getSpec(){
		return this.specialization;
	}

}
