package StringLearn;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Yuan Zhibo
 * @ClassName BigIntegerTest.java
 * @Description TODO
 * @createTime 2020年03月18日 16:31:00
 */
public class BigIntegerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many nums do u need to draw?");
        int k = in.nextInt();

        System.out.println("What is the highest number can u draw?");
        int n = in.nextInt();

        BigInteger lotteryOdds = BigInteger.valueOf(1);
        for(int i = 1; i<=k; i++){
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n-i+1)).divide(BigInteger.valueOf(i));
        }

        System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
    }
}
