package com.phb.cpt;
/***
 * 1.ArrayList的迭代器
2.foreach语句的解释意思：for(String s : bag)  每运行一次, 先判断 bag给的 iterator 
的 hasNext方法有没有下一个值, 有的话调用next()获取下一个值, 没有则循环中止
3.自己写迭代器
实现 Iterator的时候, hasNext的作用是 判断传入的数据有没有遍历完  next的作用是返回下一个数据。
4.Iterable 接口 和 Iterator接口
java官方提供的数据列表类如 ArrayList , LinkList等都实现了Iterable接口
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Bag<T> implements Iterable<T> {

	private ArrayList<T> mDatas=new ArrayList<>();
	
	public void add(T i)
	{
		mDatas.add(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bag<String> bag=new Bag<>();
		bag.add("a");
		bag.add("b");
		bag.add("c");
		bag.add("f");
		for(String s:bag)
		{
			System.out.println(s);
			
		}
	}

	
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		//return mDatas.iterator();//ArrayList的迭代器
		return new MyBagIterator<T>(mDatas);//我创建的迭代器

	}
	
	
	public static class MyBagIterator<T> implements Iterator<T>
	{
		private ArrayList<T> mList;
		private int position=-1;
		
		public MyBagIterator(ArrayList<T> datas)
		{
			this.mList=datas;
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			position++;
			return position<mList.size();
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			return mList.get(position);
		}
		
	}

}
