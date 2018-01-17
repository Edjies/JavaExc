package com.phb.exc1;

import java.util.Scanner;
import edu.colorado.collections.IntArrayBag;

public class BagDemonstration {
	private static Scanner stdin=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntArrayBag ages=new IntArrayBag();
		getAges(ages);
		checkAges(ages);
		System.out.println("May your family live long and prosper");

	}

	private static void getAges(IntArrayBag ages) {
		// TODO Auto-generated method stub
		System.out.println("Type the ages of your family members.");
		System.out.println("Type a negative number at the end and press return.");
		int userInput = stdin.nextInt();
		while(userInput>=0)
		{
			ages.add(userInput);
			userInput=stdin.nextInt();
		}
	}

	private static void checkAges(IntArrayBag ages) {
		// TODO Auto-generated method stub
		int userInput;
		System.out.println("Type those ages again.");
		System.out.println("Press return after each age.");
		while(ages.size()>0)
		{
			System.out.println("Next age:");
			userInput=stdin.nextInt();
			if(ages.countOccurrences(userInput)==0)
			{
				System.out.println("No,that age does not occur!");
				
			}
			else 
			{
				System.out.println("Yes,i hava got that age and will remove it.");
				ages.remove(userInput);
			}
		}
	}

}
