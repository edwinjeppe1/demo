package com.testingtests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	private int _valueA;
	private int _valueB;
	
	
	@Before
	 public void InitializeCalculationVariables(){
	    _valueA = 5;
	    _valueB = 2;
	  }
	
	@Test(timeout=1000)
	public void Test_Calculations_Multiply_Pass() {
		assertEquals("Should be 10", 10,Calculations.Multiply(_valueA, _valueB));	
	}

	@Test(timeout=1000)
	public void Test_Calculations_Multiply_Fail() {
		assertNotEquals("Should not be 10", 11,Calculations.Multiply(_valueA, _valueB));	
	}

}
