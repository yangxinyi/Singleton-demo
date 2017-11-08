package com.winxuan;

/**
 * 单例模式 - 静态内部类
* @Title: SingletonStatic.java
* @Description: TODO(website)
* @author yangxinyi
* 2017年11月7日 下午6:35:13
* @version V1.0
 */
public class SingletonStatic {
	private static class SingletonHolder {
		private static final SingletonStatic INSTANCE = new SingletonStatic();
	}
	
	private SingletonStatic() {
		
	}
	
	public static SingletonStatic getInstanceStatic() {
		return SingletonHolder.INSTANCE;
	}
	
	public void printLog() {
		System.out.println(this);
	}
}
