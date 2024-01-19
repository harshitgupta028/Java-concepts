package Questions;

import java.util.Scanner;

/**
 * fabonnachi
 */
public class fabonnachi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to which you want to generate the series: ");
        int count = sc.nextInt();

        sc.close();
        
        int firstElem = 0;
        int secondElem = 1;

        System.out.println(firstElem);
        System.out.println(secondElem);

        int nextNo;

        for (int i = 0; i < count; i++) {
            
            nextNo = firstElem + secondElem;

            System.out.println(nextNo);

            firstElem = secondElem;
            secondElem = nextNo;
            
        }
    }
}