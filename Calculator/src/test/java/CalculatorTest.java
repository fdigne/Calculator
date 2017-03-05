import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	
	private static final float a = 7;
	private static final float b = 5;

	@Test
	public void AdditionTest() {
		assertTrue(a+b == Calculator.additionner(a, b));
	}
	
	@Test
	public void MultiplicationTest() {
		assertTrue(a*b == Calculator.multiplier(a, b));
	}
	@Test
	public void DivisionTest() {
		assertTrue(a/b == Calculator.diviser(a, b));
	}
	@Test
	public void SoustractionTest() {
		assertTrue(a-b == Calculator.soustraire(a, b));
	}
	@Test
	public void ComplexeTest() {
		assertTrue((a*b)+(a/b) == Calculator.complexe(a, b));
	}

}
