package Strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShoppingCart sc = new ShoppingCart();
        DiscountStrategy dc = null;
        

        System.out.println("How do you wanna pay?\n1.Regular \n2.VIP \n3.Premium \n");
        Scanner s= new Scanner(System.in);
        String choice = s.nextLine();
        double amount = 100.0;

        if(choice.equals("1")){
            dc = new Regular();
           
        }
        else if(choice.equals("2")){
            dc = new VIP();
        }
        else{
            dc= new Premium();
        }

        sc.setStrategy(dc);
        System.out.println("Total amount"+ sc.calculateTotal(amount));
    }
}
