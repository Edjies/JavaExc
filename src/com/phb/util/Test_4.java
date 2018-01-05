package com.phb.util;
/**
 * 静态属性
 * @author hubble
 *
 */
public class Test_4 {
	static class A{
		public static int i;
		public int j = 0;
		
		
	}
	
	public static void main(String[] args) {
		A a = new A();
		a.i++;
		a.j++;
		A b = new A();
		b.i++;
		b.j++;
		
		System.out.println(a.i);
		System.out.println(a.j);
	}
}
