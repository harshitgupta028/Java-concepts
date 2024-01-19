package Questions;

import java.util.Scanner;

/**
 * fabonnachi
 */
public class fabonnachi {

    static int nextElem;

    static void printFabonachiSeries(int count, int firstElem, int secondElem){

        if (count > 0) {
            nextElem = firstElem + secondElem;
            System.out.println(nextElem);
            firstElem = secondElem;
            secondElem = nextElem;
            printFabonachiSeries(count - 1, firstElem, secondElem);
            
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to which you want to generate the series: ");
        int count = sc.nextInt();

        sc.close();

        int firstElem = 0;
        int secondElem = 1;

        
        if (count >= 3) {
           
        System.out.println(firstElem);
        System.out.println(secondElem);

        int nextNo;

        for (int i = 0; i < count; i++) {
            
            nextNo = firstElem + secondElem;

            System.out.println(nextNo);

            firstElem = secondElem;
            secondElem = nextNo;
            
        }

        // Using recursion.
        System.out.println(count);
        firstElem = 0;
        secondElem = 1;
        System.out.println(firstElem);
        System.out.println(secondElem);
        printFabonachiSeries(count, firstElem, secondElem);
        }else{
            System.out.println(firstElem);
            System.out.println(secondElem);
    
        }
        
    }
}