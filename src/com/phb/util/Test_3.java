package com.phb.util;
/**
 * 测试 函数的值传递
 * @author hubble
 *
 */
public class Test_3 extends Object{
	static class A{
		private int i = 1;
		
		public A(int i){
			this.i = i;
		}
	}
	
	
	public static void main(String[] args) {
		A a = new A(1);
		A b = new A(2);
		int i = 1;
		int j = 2;
		swap(a, b);
		//swap(i, j); //相当于
		int i1 = i;
		int j1 = j;
		int t = i1;
	    i1 = j1;
	    j1 = i1;
	    
	    A a1 = a;
	    A b1 = b;
	    
		System.out.println(a.i);
		System.out.println(i);
	}
	
	
	public static void swap(A a, A b) {
		int t = a.i;
		a.i = b.i;
		b.i = t;
	}
	
	public static void swap(int i, int j) {
		int t = i;
		i = j;
		j = t;
	}
	

}
