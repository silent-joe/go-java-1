/**
 * Created by Sergey Poznyak on 15.01.2015
 * 
 * This program provides with the food calculations for hiking
 */
package ua.com.goit.gojava.poznyak;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The main class
 * @version 0.01 15 Jan 2015
 * @author Sergey Poznyak
 */
public class FoodCalculations {

	/**
	 * Prints the list of dishes into the console.
	 * Then prints the list of required products
	 * for the chosen dish
	 * (list is present for dish #2)
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Dish> menu = new ArrayList<Dish>(10);
		menu.add(new Dish("����"));
		menu.add(new Dish("������� ����"));
		menu.add(new Dish("������ ����"));
		menu.add(new Dish("�������� ���"));
		menu.add(new Dish("�������� � �'����"));
		System.out.println("����:");
		for (Dish value : menu) {
			System.out.println(value.getName());
		}
		menu.get(1).addProduct("������� �����", 0.08);
		menu.get(1).addProduct("���", 0.005);
		menu.get(1).addProduct("�������", 0.125);
		System.out.println("������ ������ (������ �� 1 �� 5):");
		Scanner input = new Scanner(System.in);
		int index = input.nextInt();
		input.close();
		System.out.println("�������� �������� (�� 1 ������):");
		try {
			for (Product value : menu.get(index - 1).getProductsList()) {
				System.out.println(value);
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("��������� ����� ������");
		}
	}
}
