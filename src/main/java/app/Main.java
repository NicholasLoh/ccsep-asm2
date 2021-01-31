package app;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private int threshold = 1000;
    private int surcharge = 10;
    
    public static void main(String[] args) {

        Main app = new Main();
        Scanner scanner = new Scanner(System.in);

        System.out.println("[?] Enter an amount (e.g. 10, 1000): ");
        String amount = scanner.next();

        System.out.println("[?] Enter an account name: ");
        String account = scanner.next();

        if(app.approval(amount)) {
            System.out.println("[i] The amount requires approval");
        } else {
            System.out.println("[i] The amount does not require approval");
        }

        if(app.account_check(account)) {
            System.out.println("[i] The account name is valid");
        } else {
            System.out.println("[i] The account name is invalid");
        }

    }

    /**
     * Checks if a given amount requires approval
     * Return true if a given amount is bigger than a given threshold
     * @return boolean
     */
    public boolean approval(String value) {
       int amount = Integer.parseInt(value) + surcharge;
       if(amount >= threshold) {
           return true;
       }
       return false;
   }

   /**
    * Account name specification:
    * 1. 10 alphanumeric characters
    * 2. Must start with A
    * 3. Must end with #
    *
    * This method check if account name is valid
    * @return boolean
    */
   public boolean account_check(String value) { 
       return value.contains("A") && value.contains("#") && value.length() == 10;   
   }

}
