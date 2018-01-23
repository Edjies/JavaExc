package com.phb.node;

public class BBag<T> {
	
	private NNode<T> first;//用BBag类来表示一个链表,先定一个属性用来保存首节点的位置
	
	
	/***
	 * 链表要能够添加新节点, 所以我定义一个 add 新节点的方法（在链表末尾添加一个新数据）
	 * @param i 需要添加的值
	 */
	/***
	 * 为了在链表末尾节点添加一个新结点，我需要先找到链表的末尾节点，这有两种方法，1从首结点开始遍历，
	 * 直到达到末尾节点，2.把末尾节点给保存起来。
	 * @param i
	 */
	public void add(T i)//BBag类是用来存储数据的,所以传参为泛型
	{
		//属性方法和方法局部变量的区别；方法局部变量在方法运行完之后就被销毁了。
		//为了保存变量时的下一个节点，现在定义一个Node类型的局部变量来保存。
		
		NNode<T> t=new NNode<T>(i);//把传入的i变成NNode类型t,再把t放在第一个节点的位置上
		if(first==null)
		{
			first=t;
		}
		else
		{
			NNode<T> current=first;
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
	 * 定义一个获取链表首结点的方法
	 * @return 链表的首结点
	 */
	public NNode<T> getFirstNode(){
		return first;
	}
	
	public static void main(String[] args)
	{
		BBag<Integer> bbg=new BBag<Integer>();//new一个泛型的BBag对象，将1 2 3添加到链表中。
		bbg.add(1);
		bbg.add(2);
		bbg.add(3);
		
		NNode nn=bbg.getFirstNode();
		while(nn!=null)
		{
			System.out.println(nn.first);
			nn=nn.next;
		}
		
	}
	

}
