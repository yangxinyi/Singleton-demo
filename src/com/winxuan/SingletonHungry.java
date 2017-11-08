package com.winxuan;

/**
 * 单例模式-饿汉
* @Title: SingletonHungry.java
* @Description: TODO(website)
* @author yangxinyi
* 2017年11月7日 下午6:34:20
* @version V1.0
 */
public class SingletonHungry {
	private static SingletonHungry singletonHungry = new SingletonHungry();
	
	private SingletonHungry() {
		
	}
	
	public static SingletonHungry getInstanceHungry() {
		return singletonHungry;
	}
	
	public void printLog() {
		System.out.println(this);
	}
	
}
