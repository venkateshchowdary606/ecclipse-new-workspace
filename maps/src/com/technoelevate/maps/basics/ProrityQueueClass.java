package com.technoelevate.maps.basics;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ProrityQueueClass {

	public static void main(String[] args) {
		PriorityQueue<Integer> intergers = new PriorityQueue<>(Comparator.reverseOrder());
		intergers.add(45);
		intergers.add(67);
		intergers.add(78);
		

		System.out.println(intergers);
		// Comparator<ProrityQueueClass >comparator=()

	}

}
