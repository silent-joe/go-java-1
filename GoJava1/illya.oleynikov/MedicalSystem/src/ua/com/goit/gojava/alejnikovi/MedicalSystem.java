package ua.com.goit.gojava.alejnikovi;

import java.util.*;

public class MedicalSystem {
	
	public static void main(String[] args) {
		
        ArrayList<Doctor> doctors = new ArrayList<Doctor>();
        ArrayList<String> specs = new ArrayList<String>();
        int userSelection = 0;
 
        while (userSelection != 3) try {
            System.out.println();
            userSelection = Integer.parseInt(input("��� �������� ������ ����� ������� '1'" + "\n" +
                                            "��� ��������� ������ ������ ������� '2'" + "\n" +
                                            "��� ������ ������� '3'"));
            System.out.println();
            if (userSelection == 1){
                doctors.add(createDoctor());
                //System.out.println(specs);
            	if(specs.isEmpty()){
                    specs.add(doctors.get(doctors.size() - 1).specialization);
            	}

                for (String s: specs){
                	if(s.equals(doctors.get(doctors.size() - 1).specialization)){
                		System.out.println("���� ��� ������ ");
                       // specs.add(doctors.get(doctors.size() - 1).specialization);
                	}

                }
                
                
            } else if (userSelection == 2){
            	System.out.println("�������� ������������� �����:");
            	for (Doctor doc: doctors){      
                    System.out.println(doc.specialization);
                }
            	
            }
        } catch (NumberFormatException e){
            System.err.println("�� ������ ������ ����� 1, 2 ��� 3");
        }        
 
    }
 
    public static String input(String prompt){
    	System.out.println(prompt);     	
        return (new Scanner(System.in)).nextLine();
    }
 
    private static Doctor createDoctor(){
        String name = input("������� ��� �����");
        String surname = input("������� ������� �����");
        String spec = input("������� ������������� �����"); 
        return new Doctor(name, surname, spec);
     }
	
}
