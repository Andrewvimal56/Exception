package org.exceptions;

import java.util.ArrayList;
import java.util.List;

public class IndexOutOfBoundException {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		System.out.println(l.get(6));
		
	}

}
