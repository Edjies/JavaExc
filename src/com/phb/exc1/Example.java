package com.phb.exc1;

public class Example {

	public static void sort(String[] a)
	{
		
	}
	
	private static boolean less(String a,String a2)
	{
		return a.compareTo(a2)<0;
		
		
	}
	
	private static void exch(Compareble[] a,int i,int j)
	{
		Compareble t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
	
	private static void show(String[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"");
		}
		System.out.println();
	}
	
	public static boolean isSorted(String[] a)
	{
		for(int i=1;i<a.length;i++)
			if(less(a[i],a[i-1]))
				return false;
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a=In.readStrings();
		sort(a);
		assert isSorted(a);
		show(a);
	}

}
