import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        bufferedReader.close();
        
        List<Integer> hourGlass = new ArrayList<>();
        
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                int matrixSum = 0;
                int outerCounter = 0;
                for(int k=i; k<3+i; k++){
                    int innerCounter = 0;
                    for(int l=j; l<3+j; l++){
                        
                        if(outerCounter == 1 && (innerCounter == 2 || innerCounter == 0)){
                            innerCounter = innerCounter + 1;
                            continue;
                        }else{
                            matrixSum = matrixSum + arr.get(k).get(l);
                        }
                        innerCounter = innerCounter + 1;
                        // System.out.print(arr.get(k).get(l));
                    }
                    outerCounter = outerCounter + 1;
                    // System.out.println();
                }
                hourGlass.add(matrixSum);
                // System.out.println();
            }
            // System.out.println();
        }
        
        // System.out.println(hourGlass);
        
        int maxNum = hourGlass.get(0);
        
        for(int i=0; i<hourGlass.size()-1; i++){
 
            if(maxNum < hourGlass.get(i+1)){
                maxNum = hourGlass.get(i+1);
            }
        }
        
        System.out.println(maxNum);
    }
}

