package Questions;

import java.util.Scanner;

public class primeNumber {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check if it is prime or not: ");

        int num = sc.nextInt();
        sc.close();

        int flag = 0;

        if (num == 0 || num == 1) {
            System.out.println("It is not a prime number!");
        }else{
            for (int i = 2; i <= num/2; i++) {
                if (num % i == 0) {
                    System.out.println("Not a prime number!");
                    flag = 1;
                    break;
                }
            }

            if (flag==0) {
                System.out.println("Its a prime number!");
            }
        }
        
    }
}
