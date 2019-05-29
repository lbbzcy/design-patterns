package com.lbbzcy.design.patterns.factory;

import com.lbbzcy.design.patterns.factory.framework.Factory;
import com.lbbzcy.design.patterns.factory.framework.Product;
import com.lbbzcy.design.patterns.factory.idcard.IDCardFactory;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-24 16:21
 * @Copyright: asiainfo
 */
public class Main {
	  public static void main(String[] args) {
		  //
		  Factory factory = new IDCardFactory();
		  Product card1 = factory.create("小明","1");
		  Product card2 = factory.create("小红","2");
		  Product card3 = factory.create("小刚","3");
		  card1.use();
		  card1.saveRel();
		  card2.use();
		  card2.saveRel();
		  card3.use();
		  card3.saveRel();
	  }
}
