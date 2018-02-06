package com.sk.referenceCountingGC;

/**
 * testGC方法执行之后，objA和objB会不会被GC呢？
 * @author root
 */
public class ReferenceCountingGC
{
	public Object instamce=null;
	
	private static final int _1MB=1024*1024;
	/**
	 * 这个成员变量的唯一意义就是占点内存，以便GC能在日志中看清楚是否被回收过
	 */
	private byte[] bigSize=new byte[2*_1MB];
	
	public static void testGC()
	{
		ReferenceCountingGC objA=new ReferenceCountingGC();
		ReferenceCountingGC objB=new ReferenceCountingGC();
		
		objA.instamce=objB;
		objB.instamce=objA;
		
		//假设在这里发生GC，objA 和ObjB能否被回收？
		System.gc();
	}
	
	public static void main(String[] args)
	{
		ReferenceCountingGC.testGC();
	}
}
