package com.phb.exc;

import java.util.Random;

public class Test1 {
	/**
	 * 
	 * @param bound 必须 > 0,  最大随机边界
	 * @return  返回一个值在 [0, bound) 内的随机整数
	 */
	public static int randomInt(int bound) {
		Random r = new Random();
		return r.nextInt(bound);
	}
	
	/**
	 * 
	 * @param bound
	 * @param min
	 * @param max
	 * @return
	 */
	public static int randomInt(int bound, int min, int max) {
		// TODO
	}
	
	/**
	 * 给定长度, 随机生成一个整数数组
	 * @param length
	 * @return
	 */
	public static char[] randomIntArray(int length, int min, int max) {
		// TODO
		return null;
	}
	
	/**
	 * 给定长度, 随机生成一个字符串数组, 字符范围(a~z)  
	 * @param length
	 */
	public static char[] randomString(int length) {
		// TODO
		return null;
	}
	
	/**
	 * 说明:
	 *   翻转字符串,  如给定 c = ['H', 'E', 'L', 'L', 'O'],  返回  c = ['O', 'L', 'L', 'E', 'H']
	 * 要求:
	 *   不允许创建新的数组, 在原有数组上操作
	 * @param s
	 */
	public static void reverseString(char[] s) {
		// TODO
	}

}
