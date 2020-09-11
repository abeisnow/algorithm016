package com.guolin.study;

import java.util.Deque;
import java.util.LinkedList;

public class TestDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> deque = new LinkedList<String>();
		deque.addLast("a");
		deque.addFirst("b");
		deque.addLast("c");
		System.out.println(deque);
		
		String strFirst = deque.peekFirst();
		String strLast = deque.peekLast();
		System.out.println(strFirst);
		System.out.println(strLast);
		System.out.println(deque);
		
		while (deque.size() > 0) {
			System.out.println(deque.pollFirst());
		}
		
		System.out.println(deque);

	}

}
