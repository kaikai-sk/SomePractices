package com.sk.space;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest
{

	@Test
	public void test()
	{
		Solution solution=new Solution();
		String res=solution.replaceSpace(new StringBuffer(" helloworld"));
		System.out.println(res);
	}

}
