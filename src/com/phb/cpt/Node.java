package com.phb.cpt;

public class Node<T> {
	private T t;
	protected Node<T> next;
	//private Node<T> next;
	public Node(T t)
	{
		this.t=t;
	}
	
	public T getValue(){
		return t;
	}

	public static Node<String> getLinkList()
	{
		Node<String> a=new Node<String>("a");
		Node<String> b=new Node<String>("b");
		Node<String> c=new Node<String>("c");
		Node<String> d=new Node<String>("d");
		
		a.next=b;
		b.next=c;
		c.next=d;
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<String> aa=getLinkList();

		do
		{
			System.out.println(aa.t);
			aa=aa.next;
		}
		while(aa!=null);
	}

}
