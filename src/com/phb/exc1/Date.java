package com.phb.exc1;

public class Date {
	
	private final int month;
	private final int day;
	private final int year;
	
	public Date(int m,int d,int y)
	{
		month=m;
		day=d;
		year=y;
		
	}
	public int month()
	{
		return month;
		
	}
	
	public int day()
	{
		return day;
	}
	
	public int year()
	{
		return year;
	}
	
	public String toString()
	{
		return month()+"/"+day()+"/"+year();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=Integer.parseInt("1");
		int d=Integer.parseInt("12");
		int y=Integer.parseInt("1992");
		Date date=new Date(m,d,y);
		System.out.println(date);
	}

}
