package com.sk.xuanzhuanshuzu;
import java.util.ArrayList;
public class Solution 
{
    public int minNumberInRotateArray(int [] array) 
    {
    	if(array.length==0)
    		return 0;
    	int low=0,high=array.length-1;
    	int middle=-1;
    	while(array[low]>=array[high])
    	{
    		if(high-low==1)
    		{
    			return array[high];
    		}
    		middle=(low+high)/2;
    		if(array[middle]>=array[low])
    		{
    			low=middle;
    		}
    		if(array[middle]<=array[high])
    		{
    			high=middle;
    		}
    	}
    	return array[middle];
    }
}