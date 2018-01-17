package com.phb.cls;
/***
 * 链表
 * @author dell
 *
 */
public class IntNode {
	
		private int data;
		private IntNode link;
		
		public IntNode(int initialData, IntNode initialLink) {
			// TODO Auto-generated constructor stub
			data=initialData;
			link=initialLink;
		}



		public int getData() {
			return data;
		}



		public void setData(int data) {
			this.data = data;
		}



		public IntNode getLink() {
			return link;
		}



		public void setLink(IntNode link) {
			this.link = link;
		}



		
	
	
	//在链表的非头部位置添加新结点：
	public void addNodeAfter(int element)
	{
		link=new IntNode(element,link);
	}
	//selection.addNodeAfter(element);
	
	//删除链表中非头部位置的结点：
	public void removeNodeAfter()
	{
		link=link.link;
	}
	//selection.removeNodeAfter();
	
	//操作整个链表：(计算链表长度的静态方法。)
	public static int listLength(IntNode head)
	{
		IntNode cursor;
		int answer;
		answer=0;
		for(cursor=head;cursor!=null;cursor=cursor.link)
		answer++;
		return answer;
	}
	//在链表中查找元素
	public static IntNode listSearch(IntNode head,int target)
	{
		IntNode cursor;
		for(cursor=head;cursor!=null;cursor=cursor.link)
		{
			if(target==cursor.data)
				return cursor;
		}
		
		return null;
		
	}
	//在链表中根据指定位置查找结点
	public static IntNode listPosition(IntNode head,int position)
	{
		IntNode cursor;
		int i;
		if(position<=0)
		{
			throw new IllegalArgumentException("Postion is not position");
		}
		cursor=head;
		for(i=1;(i<position)&&(cursor!=null);i++)
		{
			cursor=cursor.link;
		}
				
		return cursor;
	}
	//复制链表
	public static IntNode listCopy(IntNode source)
	{
		IntNode copyHead;
		IntNode copyTail;
		if(source==null)
		{
			return null;
		}
		copyHead=new IntNode(source.data,null);
		copyTail=copyHead;
		
		while(source.link!=null)
		{
			source=source.link;
			copyTail.addNodeAfter(source.data);
			copyTail=copyTail.link;
		}
		return copyHead;
		
	}
	//复制链表的方法二
	public static IntNode[] listCopyWithTail(IntNode source)
	{
		IntNode copyHead;
		IntNode copyTail;
		IntNode[] answer=new IntNode[2];
		
		if(source==null)
		{
			return null;
		}
		copyHead=new IntNode(source.data,null);
		copyTail=copyHead;
		
		while(source.link!=null)
		{
			source=source.link;
			copyTail.addNodeAfter(source.data);
			copyTail=copyTail.link;
		}
		answer[0]=copyHead;
		answer[1]=copyTail;
		return answer;
		
	}
	//复制链表的一部分
	public static IntNode[] listPart(IntNode start,IntNode end)
	{
		IntNode copyHead;
		IntNode copyTail;
		IntNode[] answer=new IntNode[2];
		
		if(start==null)
			throw new IllegalArgumentException("start is null");
		if(end==null)
			throw new IllegalArgumentException("end is null");
		copyHead=new IntNode(start.data,null);
		copyTail=copyHead;
		
		while(start!=end)
		{
			start=start.link;
			if(start==null)
				throw new IllegalArgumentException("end node was not found on the list");
			copyTail.addNodeAfter(start.data);
			copyTail=copyTail.link;
		}
		answer[0]=copyHead;
		answer[1]=copyTail;
		return answer;
	}
	
	
}
