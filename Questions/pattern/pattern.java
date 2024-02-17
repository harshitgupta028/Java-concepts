package Questions.pattern;

import java.util.Scanner;
import java.util.regex.Pattern;

public class pattern {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // to prevent newline ch
        int n = (Integer.parseInt(sc.nextLine()));

        for(int i=0; i<n; i++){
            String s = sc.nextLine();
            System.out.println(s);
            try{
                Pattern.compile(s);
                System.out.println("Valid");
            }catch(Exception e){
                System.out.println("Invalid");
            }
        }
    }
}
