import static org.junit.Assert.*;

import org.junit.Test;

public class LargestPrimeFactorTest {

    @Test
    public void numberWithOnePrimeFactor() {
        assertEquals(3, largestPrimeFactorOf(3));
    }

    @Test
    public void numberWithOnTwoPrimeFactorsReturnsLargest() {
        assertEquals(5, largestPrimeFactorOf(10));
    }

    @Test
    public void exampleTestCase() {
        assertEquals(29, largestPrimeFactorOf(13195));
    }

    @Test
    public void exampleTestCase2() {
        assertEquals(7, largestPrimeFactorOf(105));
    }

    private static long largestPrimeFactorOf(final long number) {
        long a = number;
        long currentDivisor = 2;
        long largestDivisor = 1;
        while (currentDivisor <= a / 2) {
            if (a % currentDivisor == 0) {
                largestDivisor = a / currentDivisor;
                a = largestDivisor;
                currentDivisor = 2;
            } else {
                currentDivisor++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        long number = 600851475143L;
        System.out.printf("Largest prime factor of %d is %d.\n", number, largestPrimeFactorOf(number));
        System.out.printf("%d", 5/2);
    }

    /**
     * Terrible algorithm O(n2) in the worst case
     */
    // public static long largestPrimeFactorOf(long number) {
    // long largest = 2;
    //
    // for (long i = number; i > 2; i--) {
    // if((number % i == 0) && (i > largest) && isPrime(i)) {
    // largest = i;
    // break;
    // }
    // }
    //
    // return largest;
    // }

    private static boolean isPrime(long n) {
        // can n be divided by any number between 1 and itself?
        for (long i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}
