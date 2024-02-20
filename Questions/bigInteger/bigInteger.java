package Questions.bigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class bigInteger {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String strA = sc.nextLine();
        String strB = sc.nextLine();
        
        BigInteger a = new BigInteger(strA); 
        BigInteger b = new BigInteger(strB); 

        System.out.println(a.add(b));        
        System.out.println(a.multiply(b));        
       
    }
}
