package com.sk.parameter;

/**
 * 这道题里方法中修改值都是修改形参的值，区别是一个通过形参修改堆值，而另一个仅仅只是修改形参。
          详细分析一下：
   char[] ch = {'a','b','c'};是数组，数组存放在堆中，所以当方法通过形参修改值时会去堆中修改。当成员变量ch再去访问时，堆中的值已经修改，所以输出dbc。
          而String str = new String("hello");会进行两步操作：
	1、先在堆中创建一个指定的对象"hello"，并让str引用指向该对象。
	2、在常量池中 寻找或新建 一个”hello”，并让堆中对象与之关联。
	所以当方法为形参赋值时（str="world";），只是为形参在常量池中新建一个”world”并引用，也只修改了形参，成员变量str本身未被修改。

	所以，当new了除String以外的对象时，即便通过形参修改值也会去堆中修改。

	所以，当String str = new String("hello");时产生了1-2个对象。
	Java的栈、堆、常量池和方法区。
	在jdk1.7已经将运行时常量池放入堆内存中了。栈存放引用；堆存放new对象和数组；常量池存放常量。方法区——方法中的局部变量，存放在方法运行时临时建立的方法栈中，
	其随着栈的销毁而结束
 * @author root
 */
public class ClassTest
{
	String str=new String("hello");
	char[] ch={'a','b','c'};
	
	public void fun(String str,char ch[])
	{
		str="world";
		ch[0]='d';
	}
	
	public static void main(String[] args)
	{
		ClassTest test1=new ClassTest();
		test1.fun(test1.str, test1.ch);
		System.out.print(test1.str+" and ");
		System.out.print(test1.ch);
	}
	
}
