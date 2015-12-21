package com.tj.test;

public class Singleton {

/**
 *饿汉式:(getInstance的时候) 
 */	
	private Singleton(){
	}
	
//	private static Singleton uniqueInstance;
//	public static Singleton getInstance(){
//		if(uniqueInstance == null){
//			uniqueInstance = new Singleton(); 
//		}
//		return uniqueInstance;
//	} 

/*
 由于多线程的加入，以上的设计方法会导致创建多个对象的情况(在if判断时)，违背设计的初衷，因此要加入同步机制
 */

//	private static Singleton uniqueInstance;
//	public static synchronized Singleton getInstance(){
//		if(uniqueInstance == null){
//			uniqueInstance = new Singleton();
//		}
//		return uniqueInstance;
//	}
	
/*
 以上这种做法，由于每个线程都会同步，会导致性能严重影响，因此也需要优化
 */	
	//volatile在多线程中保证了可见性
/*
 	private volatile static Singleton uniqueInstance;   
	
	public static Singleton getInstance(){
		if(uniqueInstance == null){
			synchronized (Singleton.class) {
				if(uniqueInstance == null){
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
*/	
/**
 *饱汉式：静态初始化时
 */	
	
	private static Singleton uniqueInstance = new Singleton();
	
	public static Singleton getInstance(){
		return uniqueInstance;
	}
	
	
/*
 总结：如果对性能没有太多要求，直接用方法块同步即可；如果图简单，同时在创建时不会有太大影响也可采用饱汉式
 */	
	
	
	
}