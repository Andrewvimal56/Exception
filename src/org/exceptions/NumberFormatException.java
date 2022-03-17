package org.exceptions;

public class NumberFormatException {
	public static void main(String[] args) {
		String s = "1234";
		String s2 = "Vimal344";
		// Using this method can change string into int
		int parseInt = Integer.parseInt(s);
		System.out.println(parseInt);
		int parseInt2 = Integer.parseInt(s2);
		System.out.println(parseInt2);
	}

}
