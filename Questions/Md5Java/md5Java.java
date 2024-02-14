package Questions.Md5Java;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class md5Java {
    
    public static void main(String[] args) throws NoSuchAlgorithmException {

        Scanner sc = new Scanner(System.in);
        String inpString = sc.nextLine();
        sc.close();
        
        MessageDigest md = MessageDigest.getInstance("MD5");

        byte[] messageDigest = md.digest(inpString.getBytes());

        BigInteger bi = new BigInteger(1, messageDigest);

        String ht = bi.toString(16);

        while (ht.length() < 16) {
            ht = "0" + ht;
        }

        System.out.println(ht);

    }
}
