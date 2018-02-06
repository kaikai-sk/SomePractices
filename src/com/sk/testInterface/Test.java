package com.sk.testInterface;

public interface Test
{
	public void fun1();
	abstract void fun2();
	static void fun3()
	{
		System.out.println("java1.8新特性");
	}
	default void fun4()
	{
		System.out.println("java1.8新特性+1");
	}
//	private void fun5();
//	protected void fun6();
}
