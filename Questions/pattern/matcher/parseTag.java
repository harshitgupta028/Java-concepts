package Questions.pattern.matcher;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class parseTag {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		while(testCases>0){
			String line = in.nextLine();
			
          	Pattern pat = Pattern.compile("<(.+?)>([^<]+)</\\1>");
          	Matcher mat = pat.matcher(line);
          	
          	while(mat.find()){
          	    System.out.println(mat.group(2));
          	}
			
			testCases--;
		}
    }
}
