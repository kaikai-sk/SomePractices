package com.sk.reverseList;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest
{
	private static ListNode head;
	@Before
	public void buildList()
	{
		head=new ListNode(1);
		ListNode node1=new ListNode(2);
		head.next=node1;
		ListNode node2=new ListNode(3);
		node1.next=node2;
	}
	
	@Test
	public void testReverseList()
	{
		Solution solution=new Solution();
		ListNode first=solution.ReverseList(head);
		while(first!=null)
		{
			System.out.println(first.val);
			first=first.next;
		}
	}

}
