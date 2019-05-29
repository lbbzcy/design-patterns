package com.lbbzcy.design.patterns.adapter.extend;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-23 16:57
 * @Copyright: asiainfo
 */
public class Main {
  	public static void main(String[] args) {
	  	//
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();
  	}
}
