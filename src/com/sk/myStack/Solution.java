package com.sk.myStack;
import java.util.ArrayList;
import java.util.Stack;

public class Solution
{
	private ArrayList<Integer> list=new ArrayList<Integer>();
	int top=-1;
    
    public void push(int node) 
    {
    	list.add(node);
    	top++;
    }
    
    public void pop() 
    {
    	list.remove(top);
    	top--;
    }
    
    public int top()
    {
    	return list.get(top);
    }
    
    public int min() 
    {
    	int min=Integer.MAX_VALUE;
    	for(int i=0;i<=top;i++)
    	{
    		if(list.get(i)<min)
    		{
    			min=list.get(i);
    		}
    	}
    	return min;
    }
}