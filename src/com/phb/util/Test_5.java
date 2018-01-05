package com.phb.util;

/**
 * 继承
 * @author hubble
 *
 */
public class Test_5 {
	static class A{
		protected int i = 0;
		public A() {
			i++;
		}
		
		public A(int a) {
			i += a;
		}
		
		
		public void update(int a) {
			this.i = a;
		}
		
		
		public void set(int a) {
			this.i = a;
		}
	}
	
	static class B extends A{
		public B() {
			i++;
		}
		
		public B(int b) {
			super(b);
			i += b;
		}
		
		public void update(int a) {
			super.update(a);
			i++;
		}
		
		public void set(int a) {
			i++;
		}
	}
	
	public static void main(String[] args) {
		A a = new A();
		a.set(3);
		System.out.println(a.i);
		
		A a1 = new B();
		System.out.println(a1.i);
		
		
		A a2 = new B(2);
		System.out.println(a2.i);
		
		
		A a3 = new B();
		a3.update(5);
		System.out.println(a3.i);
		
		
		A a4 = new B();
		a4.update(5);
		a4.set(5);
		System.out.println(a4.i);
	}

}
