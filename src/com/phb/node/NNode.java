package com.phb.node;

public class NNode<T> {
	protected T first;//NNode类，用来保存值和下一个节点
	protected NNode<T> next;
	public NNode(T first)
	{
		this.first=first;
	}
	
	

}
