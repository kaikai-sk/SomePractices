package com.sk.link;
import java.util.ArrayList;
import java.util.Stack;

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
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) 
    {
        Stack<Integer> stack=new Stack<Integer>();
        while(listNode!=null)
        {
        	stack.push(listNode.val);
        	listNode=listNode.next;
        }
        
        ArrayList<Integer> list=new ArrayList<Integer>();
        while(!stack.empty())
        {
        	list.add(stack.pop());
        }
        return list;
    }
}