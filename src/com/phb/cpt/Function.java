package com.phb.cpt;
/**
 * Java中的方法
 * @author hubble
 *
 */
public class Function {
	
	public static void main(String[] args) {
		// 1. 形式参数 和  实际参数  (按值调用)
		int[] b = {1, 2, 3, 4, 5};
		update(b, 1);
		System.out.println();
	}
	
	
	/**
	 * 更新数组的值
	 * @param a
	 * @param position
	 */
	public static void update(int[] a, int position){
		a[position] = 1;
	}
	
	
	

}
