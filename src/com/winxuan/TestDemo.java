package com.winxuan;

public class TestDemo implements Runnable{
	
	private enum SINGLETONTYPE {
		HUNGRY,LAZYNOSYNC,LAZYSYNC,LAZYSYNCDOUBLE,STATIC,ENUM
	}
	
	private SINGLETONTYPE type;
	
	public TestDemo(SINGLETONTYPE type) {
		this.type = type;
	}
	
	@Override
	public void run() {
		/*try {
			Thread.currentThread().sleep(1000l);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		switch (type) {
		case HUNGRY:
			//饿汉模式
			SingletonHungry.getInstanceHungry().printLog();
			break;
		case LAZYNOSYNC:
			//懒汉模式非安全
			SingletonLazy.getInstanceLazyNoSync().printLog();
			break;
		case LAZYSYNC:
			//懒汉模式安全
			SingletonLazy.getInstanceLazySync().printLog();
			break;
		case LAZYSYNCDOUBLE:
			//双重加锁
			SingletonLazy.getInstanceLazySyncDouble().printLog();
			break;
		case STATIC:
			//静态内部类
			SingletonStatic.getInstanceStatic().printLog();
			break;
		case ENUM:
			//枚举类型
			SingletonEnum.INSTANCE.printLog();
			break;
		default:
			break;
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		SINGLETONTYPE[] enums = {SINGLETONTYPE.HUNGRY, SINGLETONTYPE.LAZYNOSYNC, SINGLETONTYPE.STATIC, SINGLETONTYPE.ENUM};
		for(SINGLETONTYPE type : enums) {
			System.out.println("-----------" +type + "------------");
			TestDemo threadDemo = new TestDemo(type);
			Thread threadOne = new Thread(threadDemo);
			Thread threadTwo = new Thread(threadDemo);
			threadOne.start();
			threadTwo.start();
			Thread.sleep(2000l);
		}
		
	}
	
	
}
