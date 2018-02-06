package com.sk.rectangle;

public class Solution 
{
    public int RectCover(int target) 
    {
    	if(target==1)
    	{
    		return 1;
    	}
    	if(target==2)
    	{
    		return 2;
    	}
    	
    	int num1=1,num2=2;
    	int currentNum=0;
    	
    	for(int i=3;i<=target;i++)
    	{
    		currentNum=num1+num2;
    		num1=num2;
    		num2=currentNum;
    	}
    	return currentNum;
    }
}