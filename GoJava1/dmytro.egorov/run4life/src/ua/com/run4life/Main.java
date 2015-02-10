package ua.com.run4life;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		Main app = new Main();

		ItemMenu itemMenu1 = new ItemMenu();
		itemMenu1.setNameMenu("�������");
		ItemMenu itemMenu2 = new ItemMenu();
		itemMenu2.setNameMenu("������������ ����");
		itemMenu2.addSubMenu("������� ������������ ����");
		itemMenu2.addSubMenu("������������� ������������ ����");
		ItemMenu itemMenu3 = new ItemMenu();
		itemMenu3.setNameMenu("������ ������");

		Menu menu = new Menu();
		
		menu.addMenu(itemMenu1);
		menu.addMenu(itemMenu2);
		menu.addMenu(itemMenu3);
		
		Article article1 = new Article("�������1",Date.valueOf("2015-02-02"),"��������");
		Article article2 = new Article("�������2",Date.valueOf("2015-02-03"),"��������");
		News news = new News();
		news.addNews(article1);
		news.addNews(article2);
		UserData user1 = new UserData("����", "������", "maxpupkin@gmail.com",
				"madmax", 0, "������������", 24, "male");

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		System.out.println("�������� ����� ����");
		List<ItemMenu> itemsMenu = menu.getMenu();
		List<Article> articles = news.getArticle();
		for (ItemMenu item : itemsMenu) {
			System.out.print(item.getNameMenu() + " ");
		}
		String choice = reader.readLine();

		Boolean found = false;
		for (ItemMenu item : itemsMenu) {
			if (item.getNameMenu().contains(choice)) {
				switch (choice) {
				case "�������": {
					if(news==null){
					System.out.println("�������� ���");}
					else{
					 for(Article article: articles){
						 System.out.print(article.getName() + " ");
					 }
					}
					found=true;
					break;
				}
				case "������ ������": {
					System.out.println(user1.getName());
					System.out.println(user1.getSurName());
					System.out.println(user1.getEmail());
					System.out.println(user1.getNickName());
					System.out.println(user1.getAge());
					System.out.println(user1.getSex());
					found=true;
					break;
				}
				case "������������ ����": {
					if (user1.getPersonalPlan() == null) {
						System.out.println("� ��� ��� ��� ������������� �����");
						System.out.println(item.getSubMenu());
					}
					found=true;
					break;
				}
				}
			}
		}
		if (!found){
			System.out.println("������ ������ ���");
		}
	}
}
