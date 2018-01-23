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
	
	/**
	 * java中数据类型分为两类，一种是8中基本类型，一种是类类型。
	 * 类类型的数据有他自己的equals方法
	 * 重写node类的equals方法。
	 */
	@Override
	public boolean equals(Object obj)
	{
		//1首先判断obj属不属于Node类
		if(obj instanceof Node)
			//2然后判断obj 是不是就是该对象本身
			{
				if(obj==this)
				{
					return true;
				}
			
			//3.之后将obj转为Node类型，判断里面的各个属性是否相等
			Node node=(Node)obj;
			//node.getValue() 得到的是 传进来的 Node对象的 t值
//而 t是调用 equals()方法 的Node对象的 t值
			return t.equals(node.getValue());
			}	
		return false;	
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
