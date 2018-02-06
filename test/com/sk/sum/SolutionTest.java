package com.sk.sum;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest
{

	@Test
	public void test()
	{
		Solution solution=new Solution();
		int[][]array=new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		boolean res=solution.Find(1, array);
		System.out.println(res);
		assertEquals(true, res);
	}

}
