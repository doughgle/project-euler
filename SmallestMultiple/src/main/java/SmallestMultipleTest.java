import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import com.google.common.collect.BoundType;
import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Lists;
import com.google.common.collect.Range;

public class SmallestMultipleTest {

    @Test
    public void XX() {
        List<Integer> divisors = Arrays.asList(1);
        assertEquals(1, smallestEvenlyDivisibleMultiple(divisors));
    }

    @Test
    public void shouldReturn2WhenDivisorsAre1And2() {
        List<Integer> divisors = Arrays.asList(1, 2);
        assertEquals(2, smallestEvenlyDivisibleMultiple(divisors));
    }

    @Test
    public void shouldReturn6WhenDivisorsAre1_2_3() {
        List<Integer> divisors = Arrays.asList(1, 2, 3);
        assertEquals(6, smallestEvenlyDivisibleMultiple(divisors));
    }
    
    @Test
    public void shouldReturn2520WhenDivisorsAre1to10() {
        List<Integer> divisors = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(2520, smallestEvenlyDivisibleMultiple(divisors));
    }
    
    @Test
    public void whenDivisorsAre1to20() {
        Range<Integer> divisors = Range.closed(1, 20);
        ContiguousSet<Integer> divs = ContiguousSet.create(divisors, DiscreteDomain.integers());
        assertEquals(0, smallestEvenlyDivisibleMultiple(Lists.newArrayList(divs)));
    }
    
    public static void main(String[] args) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i < 20; i++) {
            divisors.add(i);
        }
        System.out.println(SmallestMultipleTest.smallestEvenlyDivisibleMultiple(divisors));
    }
    
    public static int smallestEvenlyDivisibleMultiple(List<Integer> divisors) {
        int number = 1;
        int size = divisors.size();
        for (int i = 0; i < size; i++) {
            Integer divisor = divisors.get(i);
            if (number % divisor != 0) {
                number++;
                i=0;
            }
        }
        return number;
    }
}
