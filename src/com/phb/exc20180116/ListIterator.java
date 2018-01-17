package com.phb.exc20180116;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ListIterator<Item> implements Iterator<Item> {
	
	private Node<Item> current;
//	private static class Node<Item>
//	{
//		private Item item;
//		private Node<Item> next;
//	}
	
	public ListIterator(Node<Item> first) {
		// TODO Auto-generated constructor stub
		current=first;
	}

	@Override 
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return current !=null;
	}
	public void remove()
	{
		throw new UnsupportedOperationException();
	}
	@Override
	public Item next()
	{
		if(!hasNext())
			throw new NoSuchElementException();
		Item item=current.getItem();
		current=current.getNext();
		return item;
	}
	

}
