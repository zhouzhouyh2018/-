package demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class test {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	/*@Test
	void test() {
		FizzBuzz instance = new FizzBuzz();
		String result = instance.of(10);
		Assert.assertEquals("Buzz",result);                                                                                                                                                                                                                                                     
	}*/
	@Test
	void test_1() {
		FizzBuzz instance = new FizzBuzz();
		String result = instance.of(51);
		Assert.assertEquals("FizzBuzz",result);                                                                                                                                                                                                                                                     
	}
	@Test
	void test_2() {
		FizzBuzz instance = new FizzBuzz();
		String result = instance.of(31);
		Assert.assertEquals("Fizz",result);                                                                                                                                                                                                                                                     
	}
	@Test
	void test_3() {
		FizzBuzz instance = new FizzBuzz();
		String result = instance.of(23);
		Assert.assertEquals("Fizz",result);                                                                                                                                                                                                                                                     
	}
	@Test
	void test_4() {
		FizzBuzz instance = new FizzBuzz();
		String result = instance.of(55);
		Assert.assertEquals("Buzz",result);                                                                                                                                                                                                                                                     
	}
	@Test
	void test_5() {
		FizzBuzz instance = new FizzBuzz();
		String result = instance.of(105);
		Assert.assertEquals("FizzBuzz",result);                                                                                                                                                                                                                                                     
	}
}
