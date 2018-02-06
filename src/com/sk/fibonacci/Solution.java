package com.sk.fibonacci;
public class Solution 
{
    public int Fibonacci(int n) 
    {
    	if(n==0)
    		return 0;
    	if(n==1)
    		return 1;
    	
    	int num1=0,num2=1;
    	int currentNum=0;
    	for(int i=2;i<=n;i++)
    	{
    		currentNum=num1+num2;
    		num1=num2;
    		num2=currentNum;
    	}
    	
    	return currentNum;
    }
}