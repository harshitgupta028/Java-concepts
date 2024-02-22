import java.util.Scanner;

public class TwoDArray {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] twoDArr = new int[6][6];
        
        for (int i = 0; i < 6; i++) {
            String st = sc.nextLine().replaceAll(" ", "");
            for (int j = 0; j < st.length(); j++) {
                twoDArr[i][j] = Integer.parseInt(String.valueOf(st.charAt(j)));  
            }
        }

        sc.close();

        for (int i = 0; i < twoDArr.length; i++) {
            for (int j = 0; j < twoDArr.length; j++) {
                System.out.print(twoDArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
