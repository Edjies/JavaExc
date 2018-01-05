package com.phb.exc;

public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1[] staff=new Employee1[3];
		
		staff[0]=new Employee1("chenyan",10000);
		staff[1]=new Employee1("chenyan1",20000);
		staff[2]=new Employee1("chenyan2",30000);
		
		for(Employee1 e:staff)
		{
			System.out.println("name="+e.getName()+",salary="+e.getSalary()+",id="+e.getId());
		}
		
		int n=Employee1.getNextId();
		System.out.println("Next available id="+n);
	}

}
