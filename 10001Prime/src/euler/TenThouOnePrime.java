package euler;

import static org.junit.Assert.*;

import org.junit.Test;

public class TenThouOnePrime {

    @Test
    public void firstPrime() {
        assertEquals(2, prime(1));
    }

    @Test
    public void sixthPrime() {
        assertEquals(13, prime(6));
    }
    
    @Test
    public void tenthPrime() {
        assertEquals(29, prime(10));
    }
    
    @Test
    public void nextPrime() throws Exception {
        assertEquals(3, nextPrime(2));
        assertEquals(5, nextPrime(3));
        assertEquals(7, nextPrime(5));
        assertEquals(11, nextPrime(7));
        assertEquals(13, nextPrime(11));
    }
    
    /**
     * Returns the nth prime number.
     * @param nth
     */
    private static long prime(long nth) {
        long prime = 2;
        for (int n = 1; n < nth; n++) {
            prime = nextPrime(prime);
        }
        return prime;
    }

    private static long nextPrime(final long start) {
        int divisor = 2;
        long number = start + 1;

        while(divisor < number) {
            if (number % divisor == 0) {
                number++;
                divisor = 2;
            } else {
                divisor++;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println("10001st Prime = " + prime(10001));
    }
}
