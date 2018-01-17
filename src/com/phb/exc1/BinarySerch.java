package com.phb.exc1;
/***
 * 二分查找（先比较目标值和mid，如果小就在左半边查找，如果大就在右半边查找，不断缩小查找范围）
 */
import java.util.Arrays;

public class BinarySerch {

	public static int rank(int key,int[] a)
	{
		int lo=0;
		int hi=a.length-1;
		while(lo<=hi)
		{
			int mid=lo+(hi-lo)/2;
			if(key<a[mid])
				hi=mid-1;
			else if(key>a[mid])
				lo=mid+1;
			else  return mid;
		}
		return -1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] whitelist=In.readInts(args[0]);
//		
//		Arrays.sort(whitelist);
//		while(!StdIn.isEmpty())
//		{
//			int key=StdIn.readInt();
//			if(rank(key,whitelist)<0)
//				StdOut.println(key);
//		}
		
		int[] a={11,22,33,44,45,66,77,88,123,896};
		int b=rank(22,a);
		System.out.println(b);
		
	}

}
