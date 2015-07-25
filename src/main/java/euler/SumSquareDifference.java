package euler;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumSquareDifference {

    @Test
    public void sumSquareDifferenceOfFirst2NaturalNumbers() {
        assertEquals(4, sumSquareDifference(2));
    }
    
    @Test
    public void sumSquareDifferenceOfFirst10NaturalNumbers() {
        assertEquals(2640, sumSquareDifference(10));
    }

    public static long sumSquareDifference(int uptoInclusive) {
        long sumOfSquares = 0;
        long acc = 0;
        for (int i = 1; i <= uptoInclusive; i++) {
            sumOfSquares += i*i;
            acc += i; 
        }
        return acc*acc - sumOfSquares;
    }
    
    public static void main(String[] args) {
        System.out.printf("Sum Square Difference of first %d numbers is %d.", 100, sumSquareDifference(100));
    }

}
