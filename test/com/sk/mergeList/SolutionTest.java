package com.sk.mergeList;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest
{
	private static List list1=new List();
	private static List list2=new List();
	
	@Before
	public void prepareData()
	{
		list1.add(new ListNode(1));
		list1.add(new ListNode(3));
		list1.add(new ListNode(5));
		//list1.printList();
		list2.add(new ListNode(2));
		list2.add(new ListNode(4));
		list2.add(new ListNode(6));
		//list2.printList();
	}
	
	@Test
	public void test()
	{
		Solution solution=new Solution();
		ListNode first=solution.Merge(list1.getHead(), list2.getHead());
		ListNode current=first;
		while(current!=null)
		{
			System.out.println(current.val+" ");
			current=current.next;
		}
		System.out.println();
	}

}
