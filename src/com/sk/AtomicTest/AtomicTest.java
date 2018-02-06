package com.sk.AtomicTest;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest
{
	public static AtomicInteger race=new AtomicInteger();
	private static final int THREADS_COUNT=20;
	
	public static void main(String[] args)
	{
		Thread[] threads=new Thread[THREADS_COUNT];
		
		for(int i=0;i<THREADS_COUNT;i++)
		{
			threads[i]=new Thread(new Runnable()
			{
				@Override
				public void run()
				{
					for(int i=0;i<10000;i++)
					{
						increase();
					}
				}
			});
			threads[i].start();
		}
		
		while(Thread.activeCount()>1)
		{
			Thread.yield();
		}
		
		System.out.println(race);
		
	}
	
	
	public static void increase()
	{
		//一切归功于incrementAndGet方法的原子性
		race.incrementAndGet();
	}
}
