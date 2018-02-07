package com.sk.shunshizhenMatrix;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class SolutionTest
{

	@Test
	public void testPrintMatrix()
	{
		//int matrix[][]=new int[][]{{1,2,3,4},{5,6,7,8}, {9,10,11,12},{13,14,15,16}};
		int[][] matrix=new int[][]{{1},{2},{3},{4},{5}};
		Solution solution=new Solution();
		ArrayList<Integer> list=solution.printMatrix(matrix);
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
	}

}
