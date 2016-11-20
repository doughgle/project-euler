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
        assertEquals(3, NextPrime.compute(2));
        assertEquals(5, NextPrime.compute(3));
        assertEquals(7, NextPrime.compute(5));
        assertEquals(11, NextPrime.compute(7));
        assertEquals(13, NextPrime.compute(11));
    }
    
    /**
     * Returns the nth prime number.
     * @param nth
     */
    private static long prime(long nth) {
        long prime = 2;
        for (int n = 1; n < nth; n++) {
            prime = NextPrime.compute(prime);
        }
        return prime;
    }

    private static long nextPrime(final long start) {
        return NextPrime.compute(start);
    }

    public static void main(String[] args) {
        System.out.println("10001st Prime = " + prime(10001));
    }
}
