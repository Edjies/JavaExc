package com.phb.exc1;
/***
 * 求数组各个元素的和
 * @author dell
 *
 */
public class Test6 {

	public static int sum(int[] a)
	{
//		int answer,i;
//		answer=0;
//		for(i=0;i<a.length;i++)
//		{
//			answer=answer+a[i];
//		}
//		return answer;
		
		int answer;
		answer=0;
		for(int item :a)
		{
			answer=answer+item;
		}
		return answer;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		int s=sum(a);
		System.out.println(s);
	}

}
