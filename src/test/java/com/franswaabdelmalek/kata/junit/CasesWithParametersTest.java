package com.franswaabdelmalek.kata.junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CasesWithParametersTest {

	private int num1;
	private int num2;
	private String str1;
	private String str2;
	private CasesWithParameters instance;
	
	public CasesWithParametersTest(int n1, int n2, String s1, String s2) {
		
		this.num1 = n1;
		this.num2 = n2;
		this.str1 = s1;
		this.str2 = s2;
		
		this.instance = new CasesWithParameters();
	}
	
	@Parameters
	public static Collection<Object[]> testData() {
		
		Object[][] testData = {{2,3,"String1","String2"},{3,5,"Hello ","World!"}};
		return Arrays.asList(testData);
	}
	
	@Test
	public void mutliplyTwoIntegers() {
		
		int result = this.num1*this.num2;
		assertEquals(result, this.instance.intMultiply(this.num1, this.num2));
	}
	
	@Test
	public void concateTwoStrings() {
		
		String result = this.str1 + this.str2;
		assertEquals(result, this.instance.stringConcate(this.str1, this.str2));
	}
}
