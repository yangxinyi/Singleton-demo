package com.winxuan;

/**
 * 单例模式 - 懒汉
* @Title: SingletonLazy.java
* @Description: TODO(website)
* @author yangxinyi
* 2017年11月7日 下午6:34:40
* @version V1.0
 */
public class SingletonLazy {
	private static SingletonLazy singletonLazy;
	private SingletonLazy() {
		
	}
	
	/**
	 * 非线程安全
	 * @return
	 */
	@Deprecated
	public static SingletonLazy getInstanceLazyNoSync() {
		if(singletonLazy == null) {
			singletonLazy = new SingletonLazy();
		}
		return singletonLazy;
	}
	
	/**
	 * 线程安全，但效率较低
	 * @return
	 */
	@Deprecated
	public synchronized static SingletonLazy getInstanceLazySync() {
		if(singletonLazy == null) {
			singletonLazy = new SingletonLazy();
		}
		return singletonLazy;
	}
	
	/**
	 * 双重校验
	 * @return
	 */
	public static SingletonLazy getInstanceLazySyncDouble() {
		if (singletonLazy == null) {
			synchronized (SingletonLazy.class) {
				if(singletonLazy == null) {
					singletonLazy = new SingletonLazy();
				}
			}
		}
		return singletonLazy;
	}
	
	public void printLog() {
		System.out.println(this);
	}
	
}
