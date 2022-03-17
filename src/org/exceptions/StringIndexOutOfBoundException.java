package org.exceptions;

public class StringIndexOutOfBoundException {
	public static void main(String[] args) {
		String s = "Java";
		// This Exception will araise whenever the string is out of bound
		
		// Nested try using
		try {
			char C = s.charAt(5);
			try {

			} 
			// i'm putting a wrong exception so its not gonna validate on first catch
			catch (ArithmeticException e) {
				System.out.println("in"
						+ "correct");
			}
			finally {

			}
			//Exception super class of all exception
		} catch (Exception e) {
			System.out.println("Correct");
		}
		finally {

		}

		char charAt = s.charAt(0);
		System.out.println(charAt);
	}

}
