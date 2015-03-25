import java.util.HashSet;
import java.util.Set;

/**
 * Palindrome Integer is a whole number which reads the same both ways.
 */
public class PalindromeInteger {

	/**
	 * Predicate to determine whether the given number is a palindrome.
	 * 
	 * @param integer
	 * @return true if palindrome, false otherwise.
	 */
	public static boolean isPalindrome(int integer) {
		String integerStr = String.valueOf(integer);
		StringBuilder sb = new StringBuilder(integerStr);
		String integerStrReversed = sb.reverse().toString();
		return integerStrReversed.equals(integerStr);
	}

	/**
	 * Returns a Set of the palindrome integers which can be made from the
	 * product of the given integers.
	 * 
	 * @param multiplicand
	 * @param multiplier
	 * @return a Set of palindrome integers.
	 */
	public static Set<Integer> getPalindromeProducts(int multiplicand,
			int multiplier) {
		Set<Integer> palindromes = new HashSet<Integer>();
		for (int i = multiplicand; i >= 0; i--) {
			for (int j = multiplier; j >= 0; j--) {
				int product = i * j;
				if (isPalindrome(product))
					palindromes.add(product);
			}
		}
		return palindromes;
	}

	/**
	 * Returns the largest Palindrome integer possible from the product of the
	 * two given integers.
	 * 
	 * @param minFactor
	 * @param maxFactor
	 * @return palindromic integer e.g. 9009
	 */
	public static int getLargestPalindromeProduct(int minFactor, int maxFactor) {
		int largestPalindromeProduct = 0;
		for (int a = maxFactor; a >= minFactor; a--) {
			for (int b = maxFactor; b >= a; b--) {
				int product = a * b;
				if (isPalindrome(product) && product > largestPalindromeProduct)
					largestPalindromeProduct = product;
			}
		}
		return largestPalindromeProduct;
	}
}
