package com.phb.exc;

public class Employee2 extends Person{
	public Employee2()
	{
		this("(2)这是第二行输出。");
		System.out.println("(3)这是第三行输出。");
	}
	public Employee2(String s)
	{
		System.out.println(s);
	}

}
