package mx.tec.kata;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	StringCalculator calculator = new StringCalculator();
	
	@Test
	void givenCalculatorWhenAddEmptyStringThenZero() {
		int expectedResult = 0;
		String numbers = "";
		int actualResult = calculator.add(numbers);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void givenCalculatorWhenAdd1Then1() {
		int expectedResult = 1;
		String numbers = "1";
		int actualResult = calculator.add(numbers);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void givenCalculatorWhenAdd1And2Then3() {
		int expectedResult = 3;
		String numbers = "1,2";
		int actualResult = calculator.add(numbers);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void givenCalculatorWhenAdd1And2And3And4And5Then15() {
		int expectedResult = 15;
		String numbers = "1,2,3,4,5";
		int actualResult = calculator.add(numbers);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void givenCalculatorWhenAdd1NewLine2Comma3Then6() {
		int expectedResult = 6;
		String numbers = "1\n2,3";
		int actualResult = calculator.add(numbers);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void givenCalculatorWhenSlashSlashSemiColonNewLine1SemiColon2Then3() {
		int expectedResult = 3;
        String numbers = "//;\n1;2";

        int actualResult = calculator.add(numbers);
        assertEquals(expectedResult, actualResult);
	}

	@Test
	void givenCalculatorWhenAdd1AndMinus2And3AndMinus4And5ThenException() {
		String expectedResult = "negatives not allowed -2, -4";
		String numbers = "1,-2,3,-4,5";
		
		try {
			
			calculator.add(numbers);
			fail("Exception Not Thrown");
		} catch(UnsupportedOperationException e){
			assertEquals(expectedResult, e.getMessage());
		}
	}
	
}
