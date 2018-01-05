package com.phb.exc;

import java.util.Scanner;

public class Test6_Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//求一元二次方程的两个根    
		System.out.println("请输入a b c 三个数字：");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int d=b*b-4*a*c;
		if(d>0)
		{
			int r1=(int) ((-b+Math.pow(d, 0.5))/(2*a));
			int r2=(int) ((-b-Math.pow(d, 0.5))/(2*a));
			System.out.println(r1);
			System.out.println(r2);
		}
		else if(d==0)
		{
			int r=(int) ((-b+Math.pow(d, 0.5))/(2*a));
			System.out.println(r);
		}
		else if(d<0)
		{
			System.out.println("The equation has no real roots.");
			
		}

		
	}

}
