package com.sk.sum;
public class Solution 
{
    public boolean Find(int target, int [][] array)
    {
    	int len=array.length-1;
    	int i=0;
    	while(len>=0 && i<array[0].length)
    	{
    		if(array[len][i]>target)
    		{
    			len--;
    		}
    		else if(target>array[len][i])
    		{
    			i++;
    		}
    		else if(target==array[len][i])
    		{
    			return true;
			}
    	}
    	return false;
    }
}