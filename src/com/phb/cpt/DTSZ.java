package com.phb.cpt;
/**
 * 创建一个动态数组
 */
import java.util.ArrayList;

public class DTSZ<T>{
	
	public static final int INIT_SIZE = 20;//声明一个静态属性存储数组的长度
	public static final int INCREASE_SIZE = 10;// 数组扩容每次增加的长度
	private Object[] arr;//声明一个数组对象
	
	public Object[] getArr() {
		return arr;
	}
	
	

	private int size = 0; // 表示当前有多少个数据
	
	public DTSZ(){
		arr = new Object[INIT_SIZE];
	}
	/**
	 * 数组的扩容方法
	 */
	public Object[] extend()
	{
		//新建一个数组，长度为 旧数组的长度+扩容长度
		Object[] arr2=new Object[arr.length+INCREASE_SIZE];
		
		// 复制，将旧数组复制到新数组
		
		for(int i = 0; i < arr.length; i++ ){
			arr2[i] = arr[i];
		}
		
		// 返回，返回新数组
		
		return arr2;
		
		
		
	}
	/**
	 * 定义一个add方法，将传入的i值放入到数组中
	 * @param i
	 */
	public void add(T i)
	{
		if(size<arr.length)//判断当前数组长度是否超出数组定义的长度。
		{
			arr[size] =  i;
		}
		else
		{
			arr = extend();
			arr[size] = i;
			
		}
		
		size++;
		
		
	}
	
	/**
	 * 查找一个数据是否存在于动态数组中
	 * 参数 t要查找的数据
	 * return 返回数据所在的位置
	 */
	public int indexOf(T t)
	{
		int count=0;
		//循环遍历动态数组中的数据，如果和要查找的数据相等，则使用equals(),
		//返回该位置，结束循环，否则返回-1,表示没找到。
		for(count=0;count<size;count++)
		{
			if(arr[count].equals(t))
			{
				return count;
			}
			
		}
		return -1;
	}
	
	/**
	 * 删除动态数组中的一个元素
	 * t 要删除的元素
	 * return
	 */
	public Boolean delete(T t)
	{
		int target=indexOf(t);
		//先判断目标数据 t是否在动态数组中，并得到其所在位置
		if(target!=-1)
		{
			//如果存在，则从该位置的后一个数起，数组中的每个数都往前移一个位置
			for(int i=target + 1;i<size;i++)
			{
				arr[i-1]=arr[i];
			}
			//数组中的数据个数减1
			size--;
			return true;
		}
		return false;
		
	}
	
	
	/**
	 * 获取动态数组的全部元素，获取动态数组里面的数组属性，
	 * 如果是private，就写一个public的方法，如果是public就直接获取就行了
	 * @return
	 */
	
	
	
	/**
	 *获取动态数组中某个位置的值(成员方法可以访问到成员对象，所以不需要传入arr)
	 * @return
	 */
	public T getElementFromArr(int position)
	{
		//Object可以强制转化成T类型，因为存储的就是T类型。
		return (T) arr[position];
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DTSZ<Integer> dt=new DTSZ<Integer>();
		dt.add(1);
		dt.add(2);
		dt.add(3);
//	        测试动态数组里面有多少个数据	
//		for(int i = 0; i < 1000; i++) {
//			dt.add(i);
//		}
//		
//		System.out.println(dt.size);
		//测试打印动态数组中的所有数据
		for(int j=0;j<dt.size;j++)
		{
			System.out.println(dt.getElementFromArr(j));
		}
	
//		for(int j=0;j<dt.size;j++)
//		{
//			if(dt.getElementFromArr(j).equals(1))
//				System.out.println(j);
//		}
		
		//测试数字5在不在动态数组中
		//System.out.println(dt.indexOf(5));
		//测试删除动态数组中的数据的方法
		System.out.println(dt.delete(1));
		for(int j=0;j<dt.size;j++)
		{
			System.out.println(dt.getElementFromArr(j));
		}
		
	
		
		
	}

}
