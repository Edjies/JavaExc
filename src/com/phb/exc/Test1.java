package com.phb.exc;

import java.util.Random;
/**
 * 
 * @author hubble
 * @date 2017-12-26
 */
public class Test1 {
	/**
	 * 随机生成一个[0, bound)范围内整数
	 * @param bound 必须 > 0,  最大随机边界
	 * @return  返回一个值在 [0, bound) 内的随机整数
	 */
	public static int randomInt(int bound) {
		Random r = new Random();
		return r.nextInt(bound);
	}
	
	/**
	 * 随机生成一个指定范围[min, max)内的整数
	 * @param bound
	 * @param min
	 * @param max
	 * @return
	 */
	public static int randomInt(int bound, int min, int max) {
		// TODO
		return 0;
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
	 * 在Java中，char类型描述了UTF-16编码中的一个代码单兀.(理解)
	 * char 类型操作
	 */
	public void charOpt(String l) {
		int maxChar = (int) Math.pow(2, 16) - 1; // char值最大的表示范围 65535
		char a = 97;
		char z = 97 + 25;
		char 潘 = 28504;
		System.out.println(a);  //  写出打印结果
		System.out.println(z);  //   写出打印结果
	}
	
	/**
	 * 随机生成一个小写字母
	 * @return
	 */
	public char randomLetter() {
		return 0;
	}
	
	
	
	/**
	 * 给定长度, 随机生成一个字符数组, 字符范围(a~z)  
	 * @param length
	 */
	public static char[] randomString(int length) {
		// TODO
		return null;
	}
	
	
//	/**
//	 * 说明:
//	 *   翻转字符串,  如给定 c = ['H', 'E', 'L', 'L', 'O'],  返回  c = ['O', 'L', 'L', 'E', 'H']
//	 * 要求:
//	 *   无
//	 * @param s
//	 */
//	public static void reverseString(char[] s) {
//		// TODO
//	}
//	
//	/**
//	 * 说明:
//	 *   翻转字符串,  如给定 c = ['H', 'E', 'L', 'L', 'O'],  返回  c = ['O', 'L', 'L', 'E', 'H']
//	 * 要求:
//	 *   不允许创建新的数组, 在原有数组上操作
//	 * @param s
//	 */
//	public static void reverseString2(char[] s) {
//		// TODO
//	}
	
	
	public static void main(String[] args) {
		char a = 97;
		char z = 97 + 25;
		System.out.println(z);
		String s = "潘浩波";
		char p = 28504;
		System.out.println(p);
		char c = 99;
	}

}
