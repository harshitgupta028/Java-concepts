package Questions;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range, to generate a random no \nmin: ");
        int min= sc.nextInt();
        System.out.print("max: ");
        int max= sc.nextInt();
        sc.close();


        // First way
        System.out.println("Random no: " + (int) Math.random()*(max - min + 1)+min);

        //Second way
        Random random = new Random();
        // There are more methods like nextDouble(), nextBoolean()
        System.out.println("Random no form Random class: " + random.nextInt(max));

        //Third way using ThreadLocalRandom class

        int randomNum = ThreadLocalRandom.current().nextInt(max);
        System.out.println("Random no form ThreadLocalRandom class: " + randomNum);



    }
}
