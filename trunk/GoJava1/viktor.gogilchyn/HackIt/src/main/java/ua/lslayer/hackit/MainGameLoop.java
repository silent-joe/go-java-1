package ua.lslayer.hackit;

import java.util.ArrayList;
import java.util.Scanner;


public class MainGameLoop 
{
    static Account myAccount;
    public static void main( String[] args )
    {
        ArrayList<Skill> skillList = new ArrayList<Skill>();
        skillList.add(new Skill("Hacking",10));
        skillList.add(new Skill("Security",2));
        skillList.add(new Skill("Bruteforce",100));
        Hero myHero = new Hero("Hero1");
        for (Skill element : skillList) {
            myHero.addSkill(element);
        }
        myAccount = new Account("accname", "masterkey");
        myAccount.setHero(myHero);
        String login = null;
        String pass = null;
        while (true) {
            while (!myAccount.loggedIn()) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Login:");
                login = scanner.nextLine();
                System.out.println("Password");
                pass = scanner.nextLine();
                scanner.close();
                System.out.println(myAccount.login(login, pass) ?
                            "Welcome " + myAccount.getHero().getName() + "!":
                            "Access Denied!");
            }
            System.out.println(myAccount.getHero().listSkills());
            System.exit(0);
        }
    }
}
