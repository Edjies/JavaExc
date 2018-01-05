package com.phb.cls;
/**
 * 设计一个秒表
 * 1.  一个默认的构造函数初始化属性为当前时间
 * 2. 完成下列方法
 * @author hubble
 *
 */

import java.sql.Time;
import java.util.Calendar;

public class StopWatch {
	private Calendar startTime;
	private Calendar endTime;
	
	public StopWatch()
	{
		this.startTime=Calendar.getInstance();
		this.endTime=Calendar.getInstance();
	}
	
	/**
	 * 重置 startTime 和 endTime 为当前时间
	 */
	public void reset() {
		startTime=Calendar.getInstance();
		endTime=Calendar.getInstance();
		
	}
	
	
	/**
	 * 记录开始时间
	 */
	public void start() {
		Calendar start=startTime;
		
	}
	
	/**
	 * 记录结束时间, 并返回和开始时间的差值
	 */
	public long end() {
		Calendar end=endTime;
		long t=endTime.getTimeInMillis()-startTime.getTimeInMillis();
		return t;
	}
	
	public static void main(String[] args) {
		// 添加代码, 记录 下面代码的执行时间, 利用 StopWatch类
		StopWatch sw=new StopWatch();
		sw.start();
		for(int i = 0; i < 10000; i++){
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		long l=sw.end();
		System.out.println(l);
	}
}
