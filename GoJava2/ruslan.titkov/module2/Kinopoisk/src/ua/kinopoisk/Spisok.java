package ua.kinopoisk;

import java.util.ArrayList;

public class Spisok {

	ArrayList<Serial> spisok = new ArrayList<>();
	
	public void addToSpisok(){
		Serial barkingBad  = new Serial();
		barkingBad.title = "������ �������� ������";
		barkingBad.season =4;
		barkingBad.episode= 12;
		spisok.add(barkingBad);
	}
	
	public static void abc(Serial serial){
		System.out.println("������:" + serial.title + " \n" + "�����:" + serial.season + " \n" + "�����:" + serial.episode);
	}
}
