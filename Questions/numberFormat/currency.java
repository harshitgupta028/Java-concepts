package Questions.numberFormat;

import java.text.*;
import java.util.*;

public class currency {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        sc.close();
        
        System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(price));
        System.out.println("India: Rs." + NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(price));
        System.out.println("China: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(price));
        System.out.println("France: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(price));
        

    }
    
}
