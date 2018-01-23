package com.phb.cpt;
/**
 * 创建一个动态数组，使用泛型类(当创建一个数组后，数组的长度就固定了，如果有不确定数量的数据需要保存，
 * 并且以数组的形式存储，单纯的数组已经无法满足这个需求了，解决方案是创建一个新的数组，将原来数组里面
 * 的数据复制过来，然后将新的数据加进去)
 * @author dell
 *
 */
public class DTSZ1<T> {
	
	//定义一个对象数组存储数据
	private Object[] arr;
	//定义数组的初始长度
	private static final int INIT_SIZE=20;
	//数组每次扩容增加的长度
	private static final int INCREASE_SIZE=20;
	//定义一个变量，原来表示当前存储了多少个数据
	private int size=0;
	
	public int getSize()
	{
		return size;
		
	}
	
	
	//写一个构造方法初始化对象数组
	public DTSZ1()
	{
		arr=new Object[INIT_SIZE];
	}
	
	/**
	 * 定义一个数组的扩容方法
	 */
	public Object[] extend()
	{
		//新建一个数组，长度为 旧数组的长度+扩容长度
		Object[] arr1=new Object[arr.length+INCREASE_SIZE];	
				
		// 复制，将旧数组复制到新数组
		for(int i=0;i<arr.length;i++)
		{
			arr1[i]=arr[i];
		}
		// 返回，返回新数组
		return arr1;
		
	}
	/**
	 * 定义一个add方法，将传进来的i放入到动态数组中去。需要分两种情况，1是数组初始长度足够，2数组
	 * 需要扩容
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
	 * 获取动态数组中某个位置的值
	 * @param args
	 */
	public T getElementFromArr(int position)
	{
		return (T) arr[position];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DTSZ1<String> d=new DTSZ1<String>();
		d.add("i");
		d.add("love");
		d.add("java");
		
		for(int i=0;i<d.size;i++)
		{
			System.out.println(d.getElementFromArr(i));
		}
	}

}
