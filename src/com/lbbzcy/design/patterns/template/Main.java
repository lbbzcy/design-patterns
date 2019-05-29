package com.lbbzcy.design.patterns.template;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-24 11:27
 * @Copyright: asiainfo
 */
public class Main {
	  public static void main(String[] args) {
		  //
		  AbstractDisplay d1 = new CharDisplay('H');
		  AbstractDisplay d2 = new StringDisplay("Hello,World.");
		  AbstractDisplay d3 = new StringDisplay("你好，世界。");
		  d1.display();
		  d2.display();
		  d3.display();
	  }
}
