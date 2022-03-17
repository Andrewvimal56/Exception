package org.exceptions;

import java.nio.file.attribute.AclEntry;

public class NullPointerException {
	public static void main(String[] args) {
		
	
	
	try {
		String s = null;
		char c=s.charAt(4);
		System.out.println(c);
	}
	catch (Exception e) {
		System.out.println("correct");
	}
	
	finally
	{
		System.out.println("correct");
	}
}
	}