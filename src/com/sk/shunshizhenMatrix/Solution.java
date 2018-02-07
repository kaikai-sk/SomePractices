package com.sk.shunshizhenMatrix;

import java.util.ArrayList;

public class Solution 
{
	ArrayList<Integer> list=new ArrayList<Integer>();
	
    public ArrayList<Integer> printMatrix(int [][] matrix) 
    {
       int rows=matrix.length;
       int columns=matrix[0].length;
       int start=0;
       while(rows>2*start && columns>start*2)
       {
    	   printMatrixInCycle(matrix,rows,columns,start);
    	   start++;
       }
       
       return list;
    }

    /**
     * 功能：打印一圈
     * @param matrix
     * @param rows
     * @param columns
     * @param start
     */
	private void printMatrixInCycle(int[][] matrix, int rows, int columns, int start)
	{
		//从左到右打印一行
		for(int i=start;i<columns-start;i++)
		{
			list.add(matrix[start][i]);
		}
		//从上向下打印一列
		for(int i=start+1;i<rows-start;i++)
		{
			list.add(matrix[i][columns-start-1]);
		}
		//从右往左打印一行
		for(int i=columns-start-2;i>=start && rows-2*start>1 ;i--)
		{
			list.add(matrix[rows-start-1][i]);
		}
		//从下往上打印一列
		for(int i=rows-start-2;i>start && columns-2*start>1 ;i--)
		{
			list.add(matrix[i][start]);
		}
	}
}