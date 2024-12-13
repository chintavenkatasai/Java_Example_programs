package Collections;

import java.util.*;

public class QPractice {
	public static void main(String[] args) {
		// Priority Queue
		
		Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
		pq.add(6);
		pq.offer(7);
		pq.offer(8);
		pq.offer(2);
		pq.offer(4);
		System.out.println(pq);
		System.out.println(pq.contains(8));
//		System.out.println(pq.peek());
//		System.out.println(pq.poll());
		System.out.println(pq);	
		
		while(!pq.isEmpty())
		{
			System.out.println(pq.poll());
		}
	}

}
