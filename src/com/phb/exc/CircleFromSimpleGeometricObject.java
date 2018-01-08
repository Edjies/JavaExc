package com.phb.exc;
//圆形类继承简单形状类
public class CircleFromSimpleGeometricObject extends SimpleGeometricObject
{
 	private double radius;

 	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public CircleFromSimpleGeometricObject()
 	{
 		

 	}
 	public CircleFromSimpleGeometricObject(double radius)
 	{
 		this.radius=radius;

 	}
 	public CircleFromSimpleGeometricObject(double radius,String color,boolean filled)
 	{
 		this.radius=radius;
 		setColor(color);//父类的私有域不能被父类之外的其他类访问，只能通过他的get和set方法访问。
 		setFilled(filled);

 	}
 	
 	
 	public double getArea()
 	{
 		return radius*radius*Math.PI;
 	}
 	
 	public double getDiameter()
 	{
 		return 2*radius;
 	}
 	
 	public double getPerimeter()
 	{
 		return 2*radius*Math.PI;
 	}
 	
 	public void printCircle()
 	{
 		System.out.println("The circle is created"+getDateCreated()+"and the radius is"+radius);
 	}
}
