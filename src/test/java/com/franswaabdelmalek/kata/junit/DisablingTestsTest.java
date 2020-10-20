package com.franswaabdelmalek.kata.junit;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Assume;
import org.junit.Ignore;
import org.junit.Test;

public class DisablingTestsTest {

	private DisablingTests instance;
	
	public DisablingTestsTest() {
		this.instance = new DisablingTests();
	}
	
	@Test
	public void disablingTestsIsLoaded() {
		
		assertNotNull(this.instance);
	}
	
	@Test
	public void runsOnLinuxWithAssumeFalse() {
		Assume.assumeFalse(System.getProperty("os.name").contains("Windows"));
		
		String msg = this.instance.runsOnlinux();
		assertTrue(msg.contains("Linux"));
	}
	
	@Test
	public void runsOnLinuxWithAssumeTrue() {
		Assume.assumeTrue(System.getProperty("os.name").contains("Linux"));
		
		String msg = this.instance.runsOnlinux();
		assertTrue(msg.contains("Linux"));
	}
	
	@Test
	public void runsOnWindowsIsIgnored() {
		Assume.assumeFalse(System.getProperty("os.name").contains("Linux"));
		
		String msg = this.instance.runsOnWindows();
		assertTrue(msg.contains("Windows"));
	}
	
	@Test
	@Ignore(value = "Statically ignore test case")
	public void staticallyIgnored() {
		
		String msg = this.instance.staticallyDisabled();
		assertTrue(msg.equals("Never runs"));
	}
}
