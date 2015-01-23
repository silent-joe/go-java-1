import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.menu();
	}

	private void menu() {
		Kickstarter kickstarter = new Kickstarter();
		kickstarter.process();
		while (true) {
			System.out.println("���������:");

			for (String text : kickstarter.categories) {
				System.out.println(text);
			}

			System.out.println("��� ������ ��������� ������� �� �����.");
			Scanner scanner = new Scanner(System.in);

			int category = Integer.parseInt(scanner.nextLine());
			if (category == 0)
				break;
			while (true) {
				if (category <= kickstarter.categories.size()) {
					System.out.println("�� ������� ��������� " + kickstarter.categories.get(category - 1));
				} else {
					System.out.println("�� ������� �������������� ���������");
				}

				if (category == 1) {

					kickstarter.projectsDescription(kickstarter.game1);
					kickstarter.projectsDescription(kickstarter.game2);
					kickstarter.projectsDescription(kickstarter.game3);
					System.out.println("0 - �����");
					System.out.println("��� ������ ������� ������� ��� �����.");

					int project = Integer.parseInt(scanner.nextLine());
					if (project == 0)
						break;
					if (project == 1) {
						kickstarter.projectsFullDescription(kickstarter.game1);
					} else if (project == 2) {
						kickstarter.projectsFullDescription(kickstarter.game2);
					} else if (project == 3) {
						kickstarter.projectsFullDescription(kickstarter.game3);
					}

				} else if (category == 2) {

					kickstarter.projectsDescription(kickstarter.technology1);
					kickstarter.projectsDescription(kickstarter.technology2);
					kickstarter.projectsDescription(kickstarter.technology3);
					System.out.println("��� ������ ������� ������� ��� �����.");
					int project = Integer.parseInt(scanner.nextLine());
					if (project == 0)
						break;
					if (project == 1) {
						kickstarter.projectsFullDescription(kickstarter.technology1);
					} else if (project == 2) {
						kickstarter.projectsFullDescription(kickstarter.technology2);
					} else if (project == 3) {
						kickstarter.projectsFullDescription(kickstarter.technology3);
					}
				}
				int project = Integer.parseInt(scanner.nextLine());
				if (project == 0)
					continue;
			}
		}
	}
}
