package com.sk.reverseList;

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
    public ListNode ReverseList(ListNode head) 
    {
    	ListNode left=null,current,right;
    	current=head;
    	if(current==null)
    	{
    		return current;
    	}
    	if(current.next==null)
    	{
    		return current;
    	}
    	right=current.next;
    	
    	while(right!=null)
    	{
    		current.next=left;
    		left=current;
    		current=right;
    		if(right!=null)
    		{
    			right=right.next;
    		}
    	}
    	current.next=left;
    	return current;
    }
}