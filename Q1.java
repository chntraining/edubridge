package com.edu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q1 {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<Integer>();
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list.size());
		System.out.println("While Loop:");
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		System.out.println("Advanced For Loop:");
		for(Integer i :list) {
			System.out.println(i);
		}
		System.out.println("For Loop:");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
