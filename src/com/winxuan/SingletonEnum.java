package com.winxuan;

/**
 * 单例模式 - 枚举
* @Title: SingletonEnum.java
* @Description: TODO(website)
* @author yangxinyi
* 2017年11月7日 下午7:19:55
* @version V1.0
 */
public enum SingletonEnum {
	INSTANCE;
	
	public void printLog() {
		System.out.println(this);
	}
}
