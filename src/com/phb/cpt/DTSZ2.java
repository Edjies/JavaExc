package com.phb.cpt;
/**
 * 动态数组的迭代
 */
import java.util.Iterator;

public class DTSZ2<T> implements Iterable<T>{
	//定义一个对象数组存储数据
	private Object[] arr;
	//定义数组的初始长度
	private static final int INIT_SIZE=20;
	//定义数组每次扩容增加的长度
	private static final int INCREASE_SIZE=20;
	//定义一个变量存储数组当前存储的元素个数
	private int size=0;
	
	public Object[] getarr()
	{
		return this.arr=arr;
	}
	
	//定义一个构造函数用来初始化对象数组
	public DTSZ2()
	{
		arr=new Object[INIT_SIZE];
	}
/**
 * 数组扩容方法
 * @param args
 */
	public Object[] extend()
	{
		//新建一个数组，长度为旧数组长度+扩容长度
		Object[] arr1=new Object[arr.length+INCREASE_SIZE];
		//将旧数组的数据复制到新数组
		for(int i=0;i<arr.length;i++)
		{
			arr1[i]=arr[i];
		}
		//返回新数组
		return arr1;
		
	}
/**
 * 添加数据到动态数组里面去，分情况：1判断数组长度是否小于初始长度，2需要扩容数组
 * @param args
 */
	public void add(T i)
	{
		if(size<INIT_SIZE)
		{
			arr[size]=i;
		}
		else
		{
			arr=extend();
			arr[size]=i;
		}
		size++;
		
	}
	

	/**
	 *获取动态数组中某个位置的值(成员方法可以访问到成员对象，所以不需要传入arr)
	 * @return
	 */
	public T getElementFromArr(int position)
	{
		//Object可以强制转化成T类型，因为存储的就是T类型。
		return (T) arr[position];
		
		
	}
	
/***
 * 自定义一个迭代器，用来迭代动态数组
 * @param args
 */
	public static class myIterator<T> implements Iterator<T>
	{
		private Object[] arr;
		private int size;
		//count用来计数
		private int count = 0;
		public myIterator(Object[] arr, int size)
		{
			this.arr=arr;
			this.size = size;
		}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		//如果count<arr.length,证明数组还有下一个值。
		if(count<size)
		{
			return true;
		}
		
		return false;
		
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		T t = (T) arr[count];
		count++;
		return t;
		
	}
		
	}
	
	

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new myIterator<T>(arr, size);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DTSZ2<Integer> dt=new DTSZ2<Integer>();
		dt.add(1);
		dt.add(2);
		dt.add(3);
		dt.add(4);
		
		for(Integer i:dt)
		{
			System.out.println(i);
		}
	}

}
