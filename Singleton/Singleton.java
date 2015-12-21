package com.tj.test;

public class Singleton {

/**
 *����ʽ:(getInstance��ʱ��) 
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
 ���ڶ��̵߳ļ��룬���ϵ���Ʒ����ᵼ�´��������������(��if�ж�ʱ)��Υ����Ƶĳ��ԣ����Ҫ����ͬ������
 */

//	private static Singleton uniqueInstance;
//	public static synchronized Singleton getInstance(){
//		if(uniqueInstance == null){
//			uniqueInstance = new Singleton();
//		}
//		return uniqueInstance;
//	}
	
/*
 ������������������ÿ���̶߳���ͬ�����ᵼ����������Ӱ�죬���Ҳ��Ҫ�Ż�
 */	
	//volatile�ڶ��߳��б�֤�˿ɼ���
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
 *����ʽ����̬��ʼ��ʱ
 */	
	
	private static Singleton uniqueInstance = new Singleton();
	
	public static Singleton getInstance(){
		return uniqueInstance;
	}
	
	
/*
 �ܽ᣺���������û��̫��Ҫ��ֱ���÷�����ͬ�����ɣ����ͼ�򵥣�ͬʱ�ڴ���ʱ������̫��Ӱ��Ҳ�ɲ��ñ���ʽ
 */	
	
	
	
}