package com.phb.cpt;

import java.util.Iterator;

import com.phb.node.NNode;

public class BagLinkListTest<T> implements Iterable<T>{
	private Node<T> first;
	private Node<T> next;
	/***
	 * 定义一个add方法，在链表的尾部添加新结点
	 * @param i
	 */
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
			//循环有几个要素: 一是循环结束条件
			//而是循环开始位置 即第一条循环
			//三是循环体的代码
			//象这种通过循环找值的, 还要判断循环结束后 存储的值是什么
			while(current.next!=null)
			{
				current=current.next;
			}
			current.next=t;
			
		}
		
	}
	/***
	 * 
	 * @author cheny
	 *定义一个迭代器MyBagIterator<T>，实现迭代器接口。
	 * @param <T>
	 */
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BagLinkListTest<Integer> bt=new BagLinkListTest<Integer>();
		bt.add(0);
		bt.add(1);
		bt.add(2);
		bt.add(4);
		for(Integer i : bt){
			System.out.println(i);
		}
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new MyBagIterator<>(first);
	}

}
