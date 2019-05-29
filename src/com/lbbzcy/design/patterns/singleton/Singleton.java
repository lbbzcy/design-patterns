package com.lbbzcy.design.patterns.singleton;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-27 09:38
 * @Copyright: asiainfo
 */
public class Singleton {
	private static Singleton singleton = new Singleton();

	private Singleton() {
    	System.out.println("生成了一个实例");
	}

	public static Singleton getInstance() {
		return singleton;
	}
}
