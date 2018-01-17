package com.phb.exc1;

public class Count {
	private final String name;
	private int count;
	
	public Count(String id)
	{
		name=id;
	}
	
	public void increment()
	{
		count++;
	}
	
	public int tally()
	{
		return count;
	}
	
	public String toString()
	{
		return count+""+name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count heads=new Count("heads");
		Count tails=new Count("tails");
		
		heads.increment();
		heads.increment();
		
		tails.increment();
		
		System.out.println(heads+""+tails);
		System.out.println(heads.tally()+tails.tally());
	}

}
