package Questions;

import java.util.Scanner;

public class Armstrong {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper range to generate the Armstrong number between 0 to ");
        int num = sc.nextInt();
        sc.close();

        for (int i = 1; i <= num; i++) {

            int count = String.valueOf(i).length();

            int currentNum = i;
            int temp = 0;
            int sum = 0;

            while (currentNum > 0) {
                temp = currentNum % 10;
                sum = sum + (int) Math.pow(temp, count);
                currentNum = currentNum / 10;
            }
            
            if (i == sum) {
                System.out.println(i);
            }
            
        }

    }


}
