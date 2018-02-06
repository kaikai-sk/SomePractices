package com.sk.mergeList;

class ListNode 
{
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution 
{
    public ListNode Merge(ListNode list1,ListNode list2) 
    {
        ListNode current1=list1;
        ListNode current2=list2;
        
        List myList=new List();
        
        while(current1!=null && current2!=null)
        {
        	if(current1.val<=current2.val)
        	{
        		myList.add(new ListNode(current1.val));
        		myList.add(new ListNode(current2.val));
        	}
        	else
        	{
        		myList.add(new ListNode(current2.val));
        		myList.add(new ListNode(current1.val));
			}
        	current1=current1.next;
        	current2=current2.next;
        	
        }
        
        while(current1!=null)
        {
        	myList.add(current1);
        	current1=current1.next;
        }
        
        while(current2!=null)
        {
        	myList.add(current2);
        	current2=current2.next;
        }
       return myList.getHead(); 
    }
}

class List
{
	private ListNode head;
	private ListNode tail;
	
	public void add(ListNode node)
	{
		if(node==null)
			return;
		if(head==null)
		{
			head=node;
			tail=node;
		}
		else if(head.next==null)
		{
			head.next=node;
			tail=node;
		}
		else
		{
			tail.next=node;
			tail=node;
		}
	}
	
	public ListNode getHead()
	{
		return head;
	}
	
	public void printList()
	{
		ListNode current=head;
		while(current!=null)
		{
			System.out.print(current.val+" ");
			current=current.next;
		}
		System.out.println();
	}
}