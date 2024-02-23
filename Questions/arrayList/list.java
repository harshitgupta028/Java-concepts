package Questions.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class list {
    
    public static void main(String argd[]){
        Scanner sc = new Scanner(System.in);
        int n =  Integer.parseInt(sc.nextLine());
        
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            
            int arrSize = sc.nextInt(); 
            List<Integer> temp = new ArrayList<>();
    
            for(int j=0; j<arrSize; j++){
                temp.add(sc.nextInt());
            }
            
            list.add(temp);
            
        }
        
        System.out.println(list);
        
        int testCase = sc.nextInt();
        
        for(int i=0; i<testCase; i++){
            int firstIndex = sc.nextInt();
            int secondIndex = sc.nextInt();
            
            if(firstIndex > 0){
                firstIndex = firstIndex - 1;
            }
            
            if(secondIndex > 0){
                secondIndex = secondIndex - 1;
            }
            
            try{
                System.out.println(list.get(firstIndex).get(secondIndex));
            }catch(Exception e){
                System.out.println("ERROR!");
            }
        }

    }
}
