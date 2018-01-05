package com.phb.exc;

class Employee1 {
	private static int nextId=1;
	
	private String name;
	private double salary;
	private int id;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		id=nextId;
		nextId++;
	}

	public static int getNextId() {
		return nextId;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	
	
	public Employee1(String n,double s)
	{
		name=n;
		salary=s;
		id=0;
	}
	
	public static void main(String[] args)
	{
		Employee1 e=new Employee1("harry",5000);
		System.out.println(e.getName()+" "+e.getSalary());
	}

}
