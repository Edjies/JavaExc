package com.phb.exc1;
/***
 * 将数组的7个元素的值都变成42
 * @author dell
 *
 */


public class Test5 {

	public static void put42s(int[] data)
	{
		int i;
		for(i=0;i<data.length;i++)
		{
			data[i]=42;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] example=new int[7];
		put42s(example);
		for(int i=0;i<example.length;i++)
		{
			System.out.println(example[i]);
		}
		
	}

}
