package com.phb.exc;

import java.util.Random;
/**
 * char练习
 * @author hubble
 * @date 2017-12-26
 */
public class Test1_Char {
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
	public static int randomInt(int min, int max) {
		// TODO
		Random r = new Random();
		return min + r.nextInt(max - min);
	}
	
	

	/**
	 * 给定长度, 随机生成一个整数数组
	 * @param length
	 * @return
	 */
	public static int[] randomIntArray(int length, int min, int max) {
		// TODO
		Random r = new Random();
		int[] arr=new int[length];
		for(int i=0;i<arr.length;i++)
		{
			int temp=min + r.nextInt(max - min);
			arr[i]=temp;
		}
		return arr;
		
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
	public static char randomLetter() {
		Random r = new Random();
		char a=(char)(97 + r.nextInt(25));
		return a;
	}
	
	
	
	/**
	 * 给定长度, 随机生成一个字符数组, 字符范围(a~z)  
	 * @param length
	 */
	public static char[] randomString(int length) {
		// TODO
		Random r=new Random();
		//报java.lang.NullPointerException的原因：
		//变量未初始化；
		//记下来
		//赋值为 null   不是初始化   
		//数组的初始化都是一样的.
		//数据类型[]   a = new 数据类型[数组长度];
		char[] arr=new char[length];
		for(int i=0;i<length;i++)
		{
			char temp=(char)(97 + r.nextInt(25));
			arr[i]=temp;
		}
		return arr;
	}
	
	
//	/**
//	 * 说明:
//	 *   翻转字符串,  如给定 c = ['H', 'E', 'L', 'L', 'O'],  返回  c = ['O', 'L', 'L', 'E', 'H']
//	 * 要求:
//	 *   无
//	 * @param s
//	 */
	public static char[] reverseString(char[] s) {
		char[] s1 = new char[s.length];
		for(int i= 0; i < s.length; i++) {
			s1[i] = s[s.length - 1 - i];
		}
		return s1;
	}
//	
//	/**
//	 * 说明:
//	 *   翻转字符串,  如给定 c = ['H', 'E', 'L', 'L', 'O'],  返回  c = ['O', 'L', 'L', 'E', 'H']
//	 * 要求:
//	 *   不允许创建新的数组, 在原有数组上操作
//	 * @param s
//	 */
	public static void reverseString2(char[] s) {
		for(int i = 0; i < s.length / 2; i++){
			char t = s[i];
			s[i] = s[s.length - 1 - i];
			s[s.length - 1 - i] = t;
		}
	}
	
	
	public static void main(String[] args) {
	/*	char a = 97;
		char z = 97 + 25;
		System.out.println(z);
		String s = "潘浩波";
		char p = 28504;
		System.out.println(p);
		char c = 99;
		
		for(int i = 0; i < 100; i++){
			System.out.println(randomInt(10, 20));
		}
		
		int[] arr=randomIntArray(3,10,20);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		
		
		char b=randomLetter();
		System.out.println(b);
		*/
		char[] arr=randomString(3);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		
		
		
	}

}
