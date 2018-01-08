package com.phb.exc;
/***
 * 构造方法链
在任何情况下，构造一个类的实例时，将会调用沿着继承链的所有父类的构造方法，当构造一个子类的对象时，
子类构造方法会在完成自己的任务之前，首先调用他的父类的构造方法。如果父类继承自其它类，那么父类的
构造方法又会在完成自己任务之前，调用他自己的父类的构造方法。这个过程持续到沿着这个继承体系结果的
最后一个构造方法被调用为止。这就是构造方法链。

！！！如果要设计一个可以被继承的类，最好提供一个无参的构造方法以避免程序设计错误。
 * @author dell
 *
 */
public class Faculty extends Employee2{
	public static void main(String[] args)
	{
		new Faculty();
		
	}
	public Faculty()
	{
		System.out.println("(4)这是第四行输出");
	}
	
}

