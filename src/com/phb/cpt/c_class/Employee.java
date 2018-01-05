package com.phb.cpt.c_class;

import java.time.LocalDate;
import java.util.Date;

/**
 * 雇员类
 * @author dell
 *
 */
public class Employee {
	// 属性
	private String name = "";   // 默认不会初始化
	private double salery;
	private Date hireDate = new Date();
	
	// 默认的构造方法
	public Employee(){
		// 1. 构造方法没有返回值类型
		
	}
	
	
	// setter
	public void setName(String name){
		// 
		this.name = wrapName(name);
		
	}
	

	
	// getter 
	public String getName(){
		return this.name;
	}
	
	public String wrapName(String name){
		return name + "a";
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
	}
	
	
	// 1. this 指针,    指向当前类的实例
	// 2. 构造函数,  用于初始化属性
}






// 1. public,  <默认的>, protected, private



