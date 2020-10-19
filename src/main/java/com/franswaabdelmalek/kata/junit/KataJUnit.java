package com.franswaabdelmalek.kata.junit;

public class KataJUnit {
	
	private static String output;

	public static void main(String[] args) {
		
		System.out.println("=== Kata Junit App ===");
		
		if(args != null && args.length > 0)
			output = args[0];
		else
			output = "N/A";
		
		System.out.println(output);
	}
	
	public static String getOutput() {
		return output;
	}
	
}