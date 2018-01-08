package com.phb.exc;
//矩形类继承简单形状类
public class RectangleFromSimpleGeometricObject extends SimpleGeometricObject{
	private double width;
	private double height;
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public RectangleFromSimpleGeometricObject()
	{
		
	}
	
	public RectangleFromSimpleGeometricObject(double width,double height)
	{
		this.height=height;
		this.width=width;
		
	}
	
	public RectangleFromSimpleGeometricObject(double width,double height,boolean filled,String color)
	{
		this.height=height;
		this.width=width;
		setColor(color);
		setFilled(filled);
		
		
	}
	
	public double getArea()
	{
		return width*height;
		
	}
	
	public double getPerimeter()
	{
		return 2*(width+height);
		
	}

}
