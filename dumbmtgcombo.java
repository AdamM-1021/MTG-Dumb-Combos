import java.math.BigInteger;
import java.util.Scanner;

public class dumbmtgcombo {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How Much Life does Bob have?");
        BigInteger x = new BigInteger(scan.nextLine());
    
        while(true) {
            x = x.add(BigInteger.ONE);
            if (x.isProbablePrime(25)) {
                if (x.add(BigInteger.valueOf(2)).isProbablePrime(25)) {
                    System.out.println("Alice should choose value " + x.add(BigInteger.valueOf(2)));
                    break;
                }
                
            }
        }
        scan.close();
    }

}
