package com.sk.jioushu;

import java.util.ArrayList;

public class Solution 
{
    public void reOrderArray(int [] array) 
    {
    	ArrayList<Integer> jishus=new ArrayList<Integer>();
    	ArrayList<Integer> oushus=new ArrayList<Integer>();
    	for(int i=0;i<array.length;i++)
    	{
    		if(array[i]%2==0)
    		{
    			oushus.add(array[i]);
    		}
    		else if(array[i]%2==1)
    		{
    			jishus.add(array[i]);
    		}
    	}
    	for(int i=0;i<jishus.size();i++)
    	{
    		array[i]=jishus.get(i);
    	}
    	for(int i=0;i<oushus.size();i++)
    	{
    		array[i+jishus.size()]=oushus.get(i);
    	}
    }
}