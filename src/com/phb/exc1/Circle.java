package com.phb.exc1;

public class Circle {
	private double radius;
	public Circle()
	{
		
	}
	public Circle(double radius)
	{
		this.radius=radius;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double getArea()
	{
		return radius*radius*Math.PI;
	}

}

class BB extends Circle
{
	private double length;
	public BB(double radius,double length)
	{
		super(radius);//调用父类的构造方法
		this.length=length;
	}
	
	public double getArea()
	{
		return super.getArea()*length;//调用父类的其他方法
	}
}
