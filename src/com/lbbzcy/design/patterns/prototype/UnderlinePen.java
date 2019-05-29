package com.lbbzcy.design.patterns.prototype;

import com.lbbzcy.design.patterns.prototype.framework.Product;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-27 14:52
 * @Copyright: asiainfo
 */
public class UnderlinePen implements Product {

	private char ulchar;

	public UnderlinePen(char ulchar) {
		this.ulchar = ulchar;
	}

	@Override
	public void use(String s) {
		int length = s.getBytes().length;
		System.out.println("\"" + s + "\"");
		for (int i = 0; i < length; i++) {
      		System.out.print(ulchar);
		}
    	System.out.println("");
	}

	@Override
	public Product createClone() {
		Product p = null;
		try {
			p = (Product)clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}
}
