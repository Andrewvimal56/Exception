package org.exceptions;

public class ArithmaticException {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		
		try {
			System.out.println(4 /0);
		}  
//		catch (Exception e) {
//			// TODO: handle exception
//		}
		
		finally {
			System.out.println("4/0 is not Dividable so thats why i'm using this try catch");
		}
		System.out.println(3);
		System.out.println(5);

//		try {
//			
//		} catch (ArithmeticException e) {
//			System.out.println("Exception Handling will happen here");
//		} finally {
//			System.out.println("Important message");
//		}
//		System.out.println(5);
//		System.out.println(6);

	}

}
