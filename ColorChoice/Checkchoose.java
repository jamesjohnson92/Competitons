/* Best Solution 
 * from code wars for problem color choose 
 */

import java.math.BigInteger;
public class Checkchoose {
  
    public static long checkchoose(long m, int n) {
        for (int i = 1; i <= n/2 + 1; i++) {
            long x = factorial(n).divide(factorial(i).multiply(factorial(n - i))).longValue();
            if (m == x)
                return i;
        }
        return -1;
    }

    public static BigInteger factorial(int a) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= a; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
