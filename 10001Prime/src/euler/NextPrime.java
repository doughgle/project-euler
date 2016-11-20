package euler;

public class NextPrime {

    private static int divisor;
    private static long number;

    public static long compute(long start) {
        divisor = 2;
        number = start + 1;

        while(divisor < number) {
            if (isDivisible()) {
                number++;
                divisor = 2;
            } else {
                divisor++;
            }
        }
        return number;
    }

    private static boolean isDivisible() {
        return number % divisor == 0;
    }

}
