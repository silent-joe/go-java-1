package goit.gojava.kickstarter;

import java.util.Random;

public class QuoteGenerator {
	public String nextQuote() {
		String[] strings = new String[] {
				"��� ����� �� �������, � ����� ... � �������� ��������� ... (�) Tor",
				"�������� ������� ������ ������� ����, ���������� � �������... (c) ��",
				"������� - ������, ����������� ��������, �� �������� ���������� �������� ... (c) ��",
				"���� ����� ���� ���� ... ����� ��� � ����� ����� ...! (c) ��",
				
		};
		
		int index = new Random().nextInt(strings.length);
		String string = strings[index];
		return string;
	}
}
