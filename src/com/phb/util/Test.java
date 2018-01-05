package com.phb.util;

public class Test {
	public int i = 0;
	public int j = 0;
	public int k = 0;
	
	{
		i = 1;
		j = 1;
		k = 1;
	}
	
	public Test() {
		this(5, 6);
		i = 2;
	}
	
	public Test(int i, int j) {
		this.i = i;
		this.j = j;
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.i);
		System.out.println(t.j);
		
	}

}
