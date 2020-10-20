package com.franswaabdelmalek.kata.junit;

public class DisablingTests {

	public String runsOnlinux() {
		
		return "It is Linux OS";
	}
	
	public String runsOnWindows() {
		
		return "It is Windows OS";
	}
	
	public String staticallyDisabled() {
		
		return "Never runs";
	}
}
