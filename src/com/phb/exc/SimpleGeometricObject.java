package com.phb.exc;
//简单形状类
public class SimpleGeometricObject {
	private String color="white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	public String getColor()
	{
		return color;
	}
	
	
	public SimpleGeometricObject(){
		dateCreated=new java.util.Date();
	}
	
	public SimpleGeometricObject(String color,boolean filled){
		dateCreated=new java.util.Date();
		this.color=color;
		this.filled=filled;
	}
	
	public java.util.Date getDateCreated()
	{
		return dateCreated;
	}
	
	public String toString()
	{
		return " created on"+dateCreated+"\ncolor:"+color+" and filled:"+filled;
	}
	
	

}
