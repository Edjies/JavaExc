package com.phb.cpt;

public class Test6 {
	static class A{
		
			private int a=0;
			public void add()
			{
				a+=1;
			}
			
			public int getValue()
			{
				return a;
			}
		}
		
		static class B extends A{
			@Override
			public int getValue()
			{
				int b=super.getValue()+1;
				return b;
			}
		}
		
	  public static void main(String[] args)
		{
			B b=new B();
			System.out.println(b.getValue());
		
		}

	}
	
	
		

	


