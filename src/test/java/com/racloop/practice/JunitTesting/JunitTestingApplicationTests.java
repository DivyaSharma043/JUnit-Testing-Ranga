package com.racloop.practice.JunitTesting;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JunitTestingApplicationTests {
	JUnitTesting jUnitTesting = new JUnitTesting();

	@Test
	void sum_three_numbers() {
		int result = jUnitTesting.sum(new int[]{1,2,3});
		assertEquals(6, result);
	}

	@Test
	void one_number() {
		assertEquals(12,jUnitTesting.sum(new int[]{12}));
	}

	@BeforeEach
	public void before()
	{
		System.out.println("BEFORE ANNOTATION");
	}

	@AfterEach
	public void after()
	{
		System.out.println("AFTER ANNOTATION");
	}

	@BeforeAll
	public static void beforeClass()
	{
		System.out.println("BEFORE CLASS ANNOTATION");
	}

	@AfterAll
	public static void afterClass()
	{
		System.out.println("AFTER CLASS ANNOTATION");
	}

}
