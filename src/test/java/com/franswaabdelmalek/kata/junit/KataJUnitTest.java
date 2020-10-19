package com.franswaabdelmalek.kata.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class KataJUnitTest {
	
	@Test
	public void kataJunitIsLoaded() {
		
		KataJUnit instance = new KataJUnit();
		assertNotNull(instance);
	}
	
	@Test
	public void kataJunitNoInputReturnNATest() {
		
		KataJUnit.main(null);
		
		assertEquals(KataJUnit.getOutput(), "N/A");
	}
	
	@Test
	public void kataJunitEmptyArrayReturnNATest() {
		
		String[] input = {};
		KataJUnit.main(input);
		
		assertEquals(KataJUnit.getOutput(), "N/A");
	}
	
	@Test
	public void ktatJunitSetOutputWithFirstElementInOneElementArrayTest() {
		
		String[] input = {"1"};
		KataJUnit.main(input);
		
		assertEquals(KataJUnit.getOutput(), "1");
	}
	
	@Test
	public void ktatJunitSetOutputWithFirstElementInMultiElementArrayTest() {
		
		String[] input = {"A","B","C"};
		KataJUnit.main(input);
		
		assertEquals(KataJUnit.getOutput(), "A");
	}
}
