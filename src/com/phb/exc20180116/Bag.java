package com.phb.exc20180116;

import java.util.Iterator;

public class Bag<Item> implements Iterable<Item> {
	private Node<Item> first;
	private int n;

//	private static class Node<Item>
//	{
//		private Item item;
//		private Node<Item> next;
//	}
	
	public Bag()
	{
		first=null;
		n=0;
	}
	
	public boolean isEmpty()
	{
		return  first==null;
	}
	
	public int size()
	{
		return n;
	}
	
	public void add(Item item)
	{
		Node<Item> oldfirst=first;
		first=new Node<Item>();
		first.setItem(item);
		first.setNext(oldfirst);
		n++;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new ListIterator<Item>(first);
	}

}
