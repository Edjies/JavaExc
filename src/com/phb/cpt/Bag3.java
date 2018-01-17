package com.phb.cpt;

import java.util.Iterator;

public class Bag3<T> implements Iterable<T>{
	
	private Node<T> first;//声明一个指向首结点的指针
	private Node<T> last;//声明一个指向尾结点的指针
	
	public void add(T i){
		Node<T> t = new Node<T>(i);//将i转变成Node类型
		if(first==null&&last==null)
		{
			first=t; 
			last=t;
		}
		else
		{
			last.next=t;//把t放在last后面
			last = t;//让last指向t
		}
	}
	
	@Override
	public Iterator<T> iterator(){
		return new MyBagIterator<T>(first);//new一个我构建的迭代器，把链表放在迭代器里面迭代（只需传入首结点即可）
	}
	
	class MyBagIterator<T> implements Iterator<T>{
		private Node<T> pointer;//声明一个私有的指针域
		
		public MyBagIterator(Node<T> first){
			this.pointer = first;//最开始将指针指向第一个结点
		}
		
		@Override
		public boolean hasNext() {
			// 如果data 为空， 表明没有下一个值了呗
			//return data != null;
			if(pointer == null) {
				return false;
			}else {
				return true;
			}
		}

		@Override
		public T next() {
		
			T t = pointer.getValue();
			pointer = pointer.next;
			return t;
		}

		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bag3<Integer> b3=new Bag3<Integer>();
		b3.add(1);
		b3.add(2);
		b3.add(3);
		b3.add(4);
		
		for(Integer i : b3){
			System.out.println(i);
		}
	}
	

}
