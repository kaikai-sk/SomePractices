package com.sk.binarySearch;

public class Solution 
{
    public boolean VerifySquenceOfBST(int [] sequence) 
    {
    	if(sequence.length==0)
    	{
    		return false;
    	}
    	if(sequence.length==1)
    	{
    		return true;
    	}
    	return judege(sequence,0,sequence.length-1);
    }

    /**
     * 
     * @param sequence
     * @param i
     * @param j
     * @return
     */
	private boolean judege(int[] sequence, int start, int root)
	{
		if(start>=root)
			return true;
		int i=root;
		//从后面开始找
		while( i>start && sequence[i-1]>sequence[root])
			i--;
		//从前面开始找
		for(int j=start;j<i-1;j++)
		{
			if(sequence[j]>sequence[root])
			{
				return false;
			}
		}
		return judege(sequence, start, i-1) && judege(sequence, i, root-1);
	}
}