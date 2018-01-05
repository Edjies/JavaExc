package com.phb.exc;

import java.time.LocalDate;

public class Employee {
	private String name;
	private double salary;
	private LocalDate hireDay;
	
	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public LocalDate getHireDay() {
		return hireDay;
	}
	//构造方法
	public Employee(String n,double s,int year,int month,int day)
	{
		name=n;
		salary=s;
		hireDay=LocalDate.of(year,month,day);
	}
	
	public void raiseSalary(double byPercent)
	{
		double raise=salary*byPercent/100;
		salary+=raise;
	}
	

}
