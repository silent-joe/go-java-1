package kickstarter_gk;

import java.util.Scanner;


public class Scaner {
    private Scanner scanner = new Scanner(System.in);
    
    
    public int Input () {
      return scanner.nextInt();
       }
    
    protected void finalize()  {
    	scanner.close();
    }
    
}


