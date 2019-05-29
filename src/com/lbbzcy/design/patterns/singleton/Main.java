package com.lbbzcy.design.patterns.singleton;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-27 09:40
 * @Copyright: asiainfo
 */
public class Main {
	  public static void main(String[] args) {
		//
		System.out.println("Start.");
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		if (obj1 == obj2) {
			System.out.println("obj1和obj2是相同的实例");
		} else {
			System.out.println("obj1和obj2是不同的实例");
		}

	  	for (int i = 0; i < 9; i++) {
	  		Triple triple = Triple.getInstance(i % 3);
	  		System.out.println(i + ":" + triple);
	  	}
		System.out.println("End.");
	  }
}
