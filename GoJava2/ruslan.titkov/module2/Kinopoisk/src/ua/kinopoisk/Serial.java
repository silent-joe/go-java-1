
package ua.kinopoisk;

import java.util.Scanner;

public class Serial {
	String  title;
	int season;
	int episode;

	public void setTitle() // ����� ��� ������������ �������� (set)
	
	{
		
		System.out.println("������� �������� �������:");
		Scanner scanner = new Scanner (System.in);
		title = scanner.nextLine();

	}
	
	public void setSeason()
     	{
		
		System.out.println("������� ����� ������:");
		Scanner scanner = new Scanner (System.in);
		season = scanner.nextInt();

     	}
	
	public void setEpisode()
 			{
	
	System.out.println("������� ����� �����:");
	Scanner scanner = new Scanner (System.in);
	episode = scanner.nextInt();

 			}
	
    public String getTitle() // ����� ��� ���������/����������� �������� (get)
	
				{
		
		return title;
				}
	
    public int getEpisode()
	
    					{
   		
   		return episode;
    					}
    
    public int getSeason()
	
							{

        return season;
							}

}
