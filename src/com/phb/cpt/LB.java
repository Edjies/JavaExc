package com.phb.cpt;



public class LB<T> {
	//定义一个属性来保存首结点的位置。
	private Node<T> first;
	
	public Node<T> getFirst() {
		return first;
	}

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
		
		Node<T> t=new Node<T>(i);//把传入的i变成NNode类型t,再把t放在第一个节点的位置上
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
	 * 定义一个获取链表首结点的方法
	 * @return 链表的首结点
	 */
	public Node<T> getFirstNode(){
		return first;
	}
	
	/***
	 * 查找一个结点是否存在于链表中
	 * @param 参数t要查找的结点的值
	 * 返回该结点
	 */
	public Node<T> getJieDian(T t)
	{
		//把current指向首结点
		Node<T> current=first;
		//把t转化成结点的形式
		Node<T> tt=new Node<T>(t);
		//先判断链表是否为空
		if(first==null)
		{
			return null;
		}
		else//链表不为空时
		{
			while(current.next!=null)//遍历该链表，
			{
				current=current.next;
				if(current.equals(tt))//如果当前指向的结点等于目标结点，返回当前结点
				{
					return current;
				}
				
			}
		}
		return null;//否则返回空
		
	}
	
	
	/***
	 * 删除链表中的一个元素
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
