package edu.colorado.collections;

public class IntArrayBag implements Cloneable{
	private int[] data;
	private int manyItems;
	
	public IntArrayBag()//1
	{
		final int INITIAL_CAPACITY=10;
		manyItems=0;
		data=new int[INITIAL_CAPACITY];
	}
	
	public IntArrayBag(int initialCapacity)//2
	{
		if(initialCapacity<0)
		{
			throw new IllegalArgumentException
			("initialCapacity is nagative:"+initialCapacity);
		}
		manyItems=0;
		data=new int[initialCapacity];
		
		
	}

	public void add(int element) //3
	{
		// TODO Auto-generated method stub
		if(manyItems==data.length)
		{
			ensureCapacity(manyItems*2+1);
		}
		
		data[manyItems]=element;
		manyItems++;
	}
	
	public void addAll(IntArrayBag addend)
	{
		ensureCapacity(manyItems+addend.manyItems);
		System.arraycopy(addend.data,0,data,manyItems,addend.manyItems);
		manyItems+=addend.manyItems;
	}
	
	public void addMany(int ...elements)
	{
		if(manyItems+elements.length>data.length)
		{
			ensureCapacity(manyItems+elements.length*2+1);
		}
		System.arraycopy(elements,0,data,manyItems,elements.length);
		manyItems+=elements.length;
	}
	
	public IntArrayBag clone()
	{
		IntArrayBag answer = null ;
		try {
			answer=(IntArrayBag)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		answer.data=data.clone();
		return answer;
	}

	public int countOccurrences(int target) {
		// TODO Auto-generated method stub
		int answer;
		int index;
		answer=0;
		for(index=0;index<manyItems;index++)
		{
			if(target==data[index])
				answer++;
		}
		
		return answer;
	}

	private void ensureCapacity(int minimumCapacity) {
		// TODO Auto-generated method stub
		int[] biggerArray;
		if(data.length<minimumCapacity)
		{
			biggerArray=new int[minimumCapacity];
			System.arraycopy(data, 0, biggerArray, 0, manyItems);
			data=biggerArray;
			
		}
		
	}
	public int getCapacity()
	{
		return data.length;
	}

	public boolean remove(int target) {
		// TODO Auto-generated method stub
		int index;
		index=0;
		while((index<manyItems)&&(target!=data[index]))
			index++;
		if(index==manyItems)
			return false;
		else
		{
			manyItems--;
			data[index]=data[manyItems];
			return true;
			
		}
		
		
	}
	
	
	public int size() {
		// TODO Auto-generated method stub
		
		return manyItems;
	}
	
	public void trimToSize()
	{
		int[] trimmedArray;
		if(data.length!=manyItems)
		{
			trimmedArray=new int[manyItems];
			System.arraycopy(data, 0, trimmedArray, 0, manyItems);
			data=trimmedArray;
		}
	}

	

	
	
	public static IntArrayBag union(IntArrayBag b1,IntArrayBag b2)
	{
		IntArrayBag answer=new IntArrayBag(b1.getCapacity()+b2.getCapacity());
		System.arraycopy(b1.data,0,answer.data,0,b1.manyItems);
		System.arraycopy(b2.data,0,answer.data,b1.manyItems,b2.manyItems);
		answer.manyItems=b1.manyItems+b2.manyItems;
		return answer;
	}

}
