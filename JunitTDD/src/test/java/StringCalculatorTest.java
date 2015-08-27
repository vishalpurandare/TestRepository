package test.java;

import main.java.StringCalculator;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

	/*@Test(expected = RuntimeException.class)
	public final void whenMoreThan2NumbersThenException() {
		StringCalculator.add("1, 2, 3");
	}
	*/
	
	@Test
	public final void whenLessThan2NumbersThenOk() {
		StringCalculator.add("1,2");
		Assert.assertTrue(true);
	}
	
	@Test(expected = RuntimeException.class)
	public final void whenNonNumberIsThenException(){
		StringCalculator.add("1, x");
	}
	
	@Test
	public final void whenNotCorrectSumThenFalse() {
		Assert.assertEquals(3, StringCalculator.add("1, 2"));
	}
	
	@Test
	public final void whenMoreThen2NumersCheckSum() {
		Assert.assertEquals(1+2+3+4+5, StringCalculator.add("1, 2,3,4,5"));
	}
	
	@Test(expected = RuntimeException.class)
	public final void whenNegativeNumberThenException() {
		StringCalculator.add("1,-3,4");
	}
	
	
}
