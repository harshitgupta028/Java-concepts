package Questions.pattern;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ipValidate {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String st = "Hello.IP";
        System.out.println(Pattern.matches("\\b((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.|$)){4}\\b", st));
    }
}
