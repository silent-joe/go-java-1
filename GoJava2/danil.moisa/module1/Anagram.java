package ua.com.goit.gojava.Moisa.Anagram;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Anagram {
	/*
	 * �� ���� ����������� ���������� ���������� ������ ����, �����������
	 * ���������. ���� ������ ������� �� ���� ��������� ("����� �������") ���
	 * ���� ������� ������� ���� �����������. ��������� ������� � �������.
	 * ������ "���� ���� ����" => "���� ���� ����"
	 */

	private static Scanner scan;// question

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Please enter your string of words:");
		String original = scan.nextLine();
		
		System.out.println("Anagram: ");
		
		StringTokenizer anagram = new StringTokenizer(original);
		while(anagram.hasMoreTokens()){
			String word = anagram.nextToken();
			StringBuilder sbd = new StringBuilder(word);
			System.out.print(sbd.reverse().toString() + " ");
		}	
		
		System.out.println("\n" + "Thank you for your attention! Come again !;)");
	}

}
