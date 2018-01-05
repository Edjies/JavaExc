package com.phb.exc;
/**
 * 静态属性
 * @author dell
 *
 */
public class Test7 {

	static class A{
		public static int i;
		public int j=0;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.i++;
		a.j++;
		A b=new A();
		b.i++;
		b.j++;
		
		System.out.println(a.i);
		System.out.println(a.j);

	}

}
