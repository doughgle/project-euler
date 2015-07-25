import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;

public class LargestPalindromeProductTest {

	@Test
	public void itShouldReturnTrueForNumbersThatReadTheSameBothWays() {
		assertTrue(PalindromeInteger.isPalindrome(1));
		assertTrue(PalindromeInteger.isPalindrome(222));
		assertTrue(PalindromeInteger.isPalindrome(9009));
	}

	@Test
	public void itShouldReturnFalseForNumbersThatDontReadTheSameBothWays() {
		assertFalse(PalindromeInteger.isPalindrome(10));
		assertFalse(PalindromeInteger.isPalindrome(1234));
	}

	@Test
	public void itShouldReturnListOfPossiblePalindromesForTheGivenNumberOfDigits() {
		assertEquals(
				new HashSet<Integer>(
						Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)),
				PalindromeInteger.getPalindromeProducts(9, 9));
		assertEquals(
				new HashSet<Integer>(Arrays.asList(0, 1, 2442, 2, 4884, 3, 272,
						4, 5, 6, 5225, 7, 8, 9, 282, 828, 11, 555, 3003, 22,
						575, 2992, 1881, 33, 525, 6006, 44, 292, 55, 5445,
						4664, 777, 343, 4004, 9009, 66, 77, 888, 616, 3773,
						8448, 868, 323, 333, 88, 636, 848, 1551, 99, 858, 585,
						111, 2772, 595, 8118, 2552, 6336, 121, 363, 1221, 686,
						8008, 414, 141, 1771, 949, 676, 5005, 696, 2332, 2002,
						171, 444, 4774, 4224, 434, 161, 646, 424, 5335, 666,
						3663, 656, 747, 7227, 474, 737, 5775, 464, 1001, 222,
						2112, 767, 212, 7007, 999, 5115, 232, 989, 979, 6776,
						252, 969, 494, 4554, 484, 242)),
				PalindromeInteger.getPalindromeProducts(99, 99));
	}

	@Test
	public void itShouldReturn9AsTheLargestPalindromeOf1DigitNumberProducts() {
		assertEquals(9, PalindromeInteger.getLargestPalindromeProduct(0, 9));
	}

	@Test
	public void itShouldReturn9009AsTheLargestPalindromeOf2DigitNumberProducts() {
		assertEquals(9009, PalindromeInteger.getLargestPalindromeProduct(10, 99));
	}

	public static void main(String[] args) {
		System.out
				.println("The largest palindrome made from the product of two 3-digit numbers is "
						+ PalindromeInteger.getLargestPalindromeProduct(100, 999));
	}

}
