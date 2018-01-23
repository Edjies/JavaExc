package com.phb.node;

public class CBag<T> {

	private NNode<T> first;//定义一个属性用来保存首结点的位置
	private NNode<T> last;//定义一个属性用来保存尾结点的位置
	/***
	 * 定义一个add方法，在链表的尾部添加一个新结点。
	 * @param i
	 */
	public void add(T i)
	{
		NNode<T> t=new NNode<T>(i);
		if(first==null&&last==null)
		{
			first=t;
			last=t;
		}
		else
		{
			last.next=t;
			last=t;
			
		}
		
	}
	/**
	 * 定义一个获取链表的首结点的方法。。
	 * @param args
	 */
	public NNode<T> getFirstNode()
	{
		return first;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CBag<Integer> cg=new CBag<Integer>();
		cg.add(1);
		cg.add(2);
		cg.add(3);
		cg.add(4);
		
		NNode nn=cg.getFirstNode();
		while(nn!=null)
		{
			System.out.println(nn.first);
			nn=nn.next;
		}
		
	}

}
