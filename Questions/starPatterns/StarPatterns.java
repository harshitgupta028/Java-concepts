package Questions.starPatterns;

public class StarPatterns {
    
    public static void main(String[] args) {
        
        // simple star pattern
        System.out.println("Star pattern");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        // simple star pattern reverse
        System.out.println("\nStar pattern reverse");
        for (int i = 6; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }


        // star pattern right aligned.
        System.out.println("\nStar pattern right aligned.");
        int noOfStar1 = 1;
        for (int i = 6; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < noOfStar1; j++) {
                System.out.print(" *");
            }
            System.out.println(" ");
            noOfStar1 = noOfStar1 + 1;
        }

        // star pattern right aligned.
        System.out.println("\nStar pattern center aligned.");
        int noOfStar2 = 1;
        for (int i = 6; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < noOfStar2; j++) {
                System.out.print(" *");
            }
            System.out.println(" ");
            noOfStar2 = noOfStar2 + 1;
        }

        // star pattern dimond.
        System.out.println("\nStar pattern dimond.");
        int noOfStar3 = 1;
        int noOfWhiteSpace = 2;
        for (int i = 6; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < noOfStar3; j++) {
                System.out.print(" *");
            }
            System.out.println(" ");
            noOfStar3 = noOfStar3 + 1;
        }
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < noOfWhiteSpace; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(" *");
            }
            System.out.println("");
            noOfWhiteSpace = noOfWhiteSpace + 1;
        }

        //Holow triangle pattern
        System.out.println("\nStar pattern center aligned.");
        int noOfStar4 = 1;
        for (int i = 6; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < noOfStar4; j++) {
                if (j==0) {
                    System.out.print(" * ");
                }else if(j==(noOfStar4-1)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                } 
            }
            System.out.println(" ");
            noOfStar4 = noOfStar4 + 1;
        }
        for (int i = 0; i < 7; i++) {
            System.out.print(" *");
        }
    }
}
