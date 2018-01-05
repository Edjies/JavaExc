package com.phb.exc;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] staff=new Employee[3];
		
		staff[0]=new Employee("chenyan",10000,1992,5,21);
		staff[1]=new Employee("chenyan1",20000,1992,5,22);
		staff[2]=new Employee("chenyan2",30000,1992,5,23);
		
		for(Employee e:staff)
		{
			e.raiseSalary(3);
		}
		
		for(Employee e:staff)
		{
			System.out.println("name="+e.getName()+",salary="+e.getSalary()+",hireDay="+e.getHireDay());
		}
	}

}
