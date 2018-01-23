package com.phb.cpt;

import java.util.Iterator;

public class BagLinkListTest1<T> implements Iterable<T>{

	private Node<T> first;
	private Node<T> next;
	
	public void add(T i)
	{
		Node<T> t=new Node<T>(i);//把传入的i变成Node类型t,再把t放在第一个节点的位置上
		if(first==null)
		{
			first=t;
		}
		else
		{
			Node<T> current=first;
			while(current.next!=null)
			{
				current=current.next;
			}
			current.next=t;
			
		}
	}
	
	class MyBagIterator<T> implements Iterator<T>
	{
		private Node<T> pointer;//声明一个私有的指针域
		
		public MyBagIterator(Node<T> first)
		{
			this.pointer =first;//将指针指向第一个结点。
		}

		@Override
		public boolean hasNext() { //如果pointer 为空， 表明没有下一个结点了
			// TODO Auto-generated method stub
			if(pointer==null)
			{
				return false;
			}
			return true;
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			T t=pointer.getValue();
			pointer = pointer.next;
			return t;
		}
	}

	
	
	
	
	
	
	public static void main(String[] args)
	{
		BagLinkListTest1<String> bt1=new BagLinkListTest1<String>();
		bt1.add("a");
		bt1.add("b");
		bt1.add("c");
		
		for(String s:bt1)
		{
			System.out.println(s);
		}
		
		
	}





	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new MyBagIterator<T>(first);
	}



	
}
