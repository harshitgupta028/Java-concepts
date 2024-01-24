package Questions;

import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no for which factorial is to calculate: ");
        int num = sc.nextInt();
        sc.close();

        int factorial = 1;

        while (num > 0) {
            factorial = factorial * num;
            num = num - 1;
        }

        System.out.println(factorial);
    }
}
