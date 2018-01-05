package com.phb.cls;
/**
 * 定义一个Rectangle类, 要求: 
 * 1. 两个名为width和height的double型数据域
 * 2. 一个默认的无参构造方法
 * 3. 一个width 和 height 为指定值的矩形构造方法
 * 4. 一个名为getAreaQ的方法返回这个矩形的面积
 * 5. 一个名为getPeHmeter()的方法返回周长
 * @author hubble
 *
 */
public class Rectangle {
	
	private double width;
	private double height;
	
	public Rectangle()
	{
		this.width = 0;
		this.height = 0;
	}
	
	public Rectangle(double width,double height)
	{
		this.height=height;
		this.width=width;
	}
	
	public double getArea(double width,double height)
	{
		double s=width*height;
		return s;
		
	}
	
	public double getPeHmeter(double width,double height)
	{
		double c=(width+height)*2;
		return c;
	}
	
	public static void main(String[] args) {
		// 用于测试
		Rectangle r=new Rectangle();
		double s=r.getArea(2.0, 3.0);
		double c=r.getPeHmeter(2.0, 3.0);
		System.out.println(s);
		System.out.println(c);
				
	}
}
