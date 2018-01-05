package com.phb.exc;

public class Test22 {
	static class A{
		private int i=1;
		public A(int i)
		{
			this.i=i;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A(1);
		A b=new A(2);
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		
		int i=1;
		int j=2;
		swap(a,b);
		swap(i,j);
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		
		System.out.println(a.i);
		System.out.println(i);
	}
	private static void swap(A a, A b) {
		// TODO Auto-generated method stub
		int t=a.i;
		a.i=b.i;
		b.i=t;
				
		
	}
	private static void swap(int i, int j) {
		// TODO Auto-generated method stub
		int t=i;
		i=j;
		j=t;
	}

}
