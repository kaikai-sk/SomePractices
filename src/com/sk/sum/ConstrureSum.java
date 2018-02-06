package com.sk.sum;

public class ConstrureSum
{
	public static void main(String[] args)
	{
		int n = 10;
		Temp.Reset();
		
		Temp[] a=new Temp[n];
		System.out.println(Temp.GetSum());
	}
//	
//	public static int sum(int n)
//	{
//		int result=0;
//		(n>=0) && ((result=n+sum(n-1))>0);
//		return result;
//	}
//	
}





class Temp
{
	private static int N;
	private static int Sum;
	
	public static int GetSum()
	{
		return Sum;
	}
	
	public static void Reset()
	{
		N=0;
		Sum=0;
	}
	
	public Temp()
	{
		N++;
		Sum+=N;
	}
}
