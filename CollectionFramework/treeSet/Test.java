package CollectionFramework.treeSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import Questions.palindrome;

public class Test {
    
    public static void main(String[] args) {
        
       String A = "a";
       
       int loopTime = A.length()/2;

       if (loopTime > 0) {
        
       String palindrome = "No";

        for (int i = 0; i < loopTime; i++) {
            if(A.charAt(i) == A.charAt((A.length()-i)-1)){
                palindrome = "Yes";
            }else{
                break;
            }
            
        }

        System.out.println(palindrome);
    }else{
        System.out.println("Yes");
    }

    }
}
