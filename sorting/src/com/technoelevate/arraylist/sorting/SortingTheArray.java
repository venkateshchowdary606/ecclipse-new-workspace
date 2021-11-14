package com.technoelevate.arraylist.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortingTheArray {

	public static void main(String[] args) {
		List<Integer> list=new LinkedList<Integer>();
		list.add(10);
		list.add(80);
		list.add(60);
		list.add(74);
		list.add(8);
		Collections.sort(list);
		list.forEach(System.out::println);
		list.remove(3);
		list.forEach(System.out::println);
		Comparable<Integer> comparable=(o1)->{
			return 1;};
		

	}

}
