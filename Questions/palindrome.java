package Questions;

import java.util.Scanner;

public class palindrome {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check if it is palendrome or not: ");

        String strNum = sc.nextLine();
        int num = Integer.parseInt(strNum);
        int numCopy = num;
        sc.close();

        int reverseNo = 0;

        for (int i = 0; i < strNum.length(); i++) {
            
            int temp;
            temp = num % 10;
            reverseNo = (reverseNo*10) + temp;
            num = num / 10;

            System.out.println(reverseNo);
        }

        if (reverseNo == numCopy) {
            System.out.println("It is palendrome");
        } else {
            System.out.println("It is not a palendrome");
        }

    }
}
