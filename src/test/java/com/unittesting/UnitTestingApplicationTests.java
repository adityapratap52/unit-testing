package com.unittesting;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//@SpringBootTest					// It is used to run whole container
class UnitTestingApplicationTests {

	private Calculator calculator = new Calculator();

	@Test
	void contextLoads() {
	}

	@Test
	void testSum() {

		// expected
		int expectedResult = 17;

		// actual
		int actualResult = calculator.doSum(12, 3, 2);

		assertThat(actualResult).isEqualTo(expectedResult);

	}

	@Test
	@Disabled
	void testProduct() {

		// expected
		int expectedResult = 16;

		// actual
		int actualResult = calculator.doProduct(8, 2);

		assertThat(actualResult).isEqualTo(expectedResult);

	}

	@Test
	void testCompareNum() {

		Boolean result = calculator.compareNum(4, 4);

		assertThat(result).isTrue();

	}
}
