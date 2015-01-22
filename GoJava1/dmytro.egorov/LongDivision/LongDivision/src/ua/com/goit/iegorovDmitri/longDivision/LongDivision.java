package ua.com.goit.iegorovDmitri.longDivision;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LongDivision {

	public static void main(String[] args) throws IOException {

		int divisor = 23;
		int devident = 667;
		LinkedList<Integer> splitDevident = toArray(devident);
		System.out.println(splitDevident);
		String quotient = "";
		int counter = 0;

		while (true) {
			int i = 0;
			if ((splitDevident.size() == 1) && (splitDevident.get(0) == 0)) {
				break;
			}
			String stringNumber;
			stringNumber = "" + splitDevident.get(i);
			int number = Integer.parseInt(stringNumber);

			while (true) {
				if (counter == 10) {
					break;
				}
				if (number / divisor > 0) {
					number = Integer.parseInt(stringNumber);
					quotient += number / divisor;
					if (splitDevident.size() == 0) {
						break;
					}
					splitDevident.removeFirst();
					splitDevident.addFirst(number % divisor);
					if(splitDevident.get(0)!=0){
					System.out.println(splitDevident);
					System.out.println("quotient is " + quotient);}
					break;
				} else {

					if ((splitDevident.size() == 1) && (number / divisor == 0)) {
						splitDevident.addLast(0);
						if (counter == 0) {
							if (quotient == "") {
								quotient += 0;
							}
							quotient += ".";
						}
						counter++;
					}

					while (true) {
						if (splitDevident.size() == 1) {
							splitDevident.addLast(0);
							if (counter == 0) {
								if (quotient == "") {
									quotient += 0;
								}
								quotient += ".";
							}
							counter++;
						}
						stringNumber += splitDevident.get(i + 1);
						splitDevident.removeFirst();
						number = Integer.parseInt(stringNumber);

						if (number / divisor > 0) {
							break;
						}
					}

					System.out.println(stringNumber);
					System.out.println("-");
					System.out.println((number / divisor) * divisor);
					System.out.println(Integer.parseInt(stringNumber)
							- (number / divisor) * divisor);

					i++;
				}
			}
		}
		if (quotient.contains(".")) {
			String[] parts = quotient.split("\\.");
			System.out.print("quotient is " + parts[0] + "." + checkPeriod(parts[1]));
		} else {
			System.out.println("quotient is " + quotient);
		}

	}

	public static LinkedList<Integer> toArray(int number) {

		LinkedList<Integer> temp = new LinkedList<Integer>();

		while (number > 0) {
			temp.addFirst(number % 10);
			number = number / 10;
		}

		return temp;
	}

	public static String checkPeriod(String string) {
		String s = "";
		int i = 0, j = 0;
		for (int k = 1; k < 2; k++) {
			String[] strings = new String[15];

			while (true) {
				strings[j] = string.substring(i, i + k);
				i += k;
				j++;
				System.out.println(i + k);
				if (i + k > string.length()) {
					break;
				}
			}

			for (int n = 0; n < strings.length; n++) {
				if ((strings[n] != null) && (strings[n + 1] != null)) {
					if (strings[n].equals(strings[n + 1])) {
						if (strings[n + 2] != null) {
							if (strings[n].equals(strings[n + 2])) {
								s += "(" + strings[n] + ")";
								break;
							}
						} else {
							s += "(" + strings[n] + ")";
							break;
						}
					} else {
						s += strings[n];
					}
				}
			}
			if (s != "") {
				break;
			}

		}
		return s;
	}
}
