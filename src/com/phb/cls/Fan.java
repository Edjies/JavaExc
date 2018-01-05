package com.phb.cls;

public class Fan {

	public static final double SLOW=1;
	public static final double MEDIUM=2;
	public static final double FAST=3;
	
	private int speed=(int) SLOW;
	private boolean on=false;
	private double radius=5;
	private String color="blue";
	//四个数据域的访问器和修改器
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Fan()
	{
		this.speed=0;
		this.on=false;
		this.radius=5;
		this.color="blue";
	}
	
	public String toString()
	{
		String s="";
		if(on==true)
		{
			s="风扇的速度是"+speed+",风扇的颜色是"+color+",风扇的半径是"+radius;
		}
		else
		{
			s="fan is off";
		}
		
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan f1=new Fan();
		f1.speed=3;
		f1.radius=10;
		f1.color="yellow";
		f1.on=true;
		Fan f2=new Fan();
		f1.speed=2;
		f1.radius=5;
		f1.color="blue";
		f1.on=false;
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		

	}

}
