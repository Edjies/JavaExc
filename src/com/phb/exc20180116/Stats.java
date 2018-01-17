package com.phb.exc20180116;

public class Stats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bag<Double> numbers=new Bag<Double>();
		StdOut.print("Type a double: ");
		StdIn.readDouble();
		while(!StdIn.isEmpty())
		{
			numbers.add(StdIn.readDouble());
		}
		int N=numbers.size();
		
		double sum=0.0;
		for(double x:numbers)
		{
			sum+=x;
			
		}
		double mean=sum/N;
		
		sum=0.0;
		for(double x:numbers)
		{
			sum+=(x-mean)*(x-mean);
			
		}
		double std=Math.sqrt(sum/N-1);
		
		
      
		StdOut.printf("Mean:%.2f\n", mean);
		StdOut.printf("Std dev:%.2f\n", std);
	}

}
