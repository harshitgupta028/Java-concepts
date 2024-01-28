package Questions.numberPatterns;

public class NumberPatterns {
    
    public static void main(String[] args) {
        
        
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println("");
        }

        System.out.println(" ");

        int count = 0;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j <= i; j++) {
                count = count + 1;
                System.out.print(count + " ");
            }
            System.out.println("");
        }
    }
}
