package com.phb.exc1;

public class Test7 {

	/***
	 * 确定double型数组中是否存在某个元素
	 * @param args
	 */
	
	public static Boolean search(double[] data,double target)
	{
		for(double item:data)
		{
			if(item==target)
			{
				return true;
			}
		}
		
		return false;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] a=new double[3];
		a[0]=1.0;
		a[1]=2.0;
		a[2]=3.0;
		boolean bn=search(a,5.0);
		System.out.println(bn);
		

	}

}
