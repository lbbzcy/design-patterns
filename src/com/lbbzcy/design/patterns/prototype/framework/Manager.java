package com.lbbzcy.design.patterns.prototype.framework;

import java.util.HashMap;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-27 14:34
 * @Copyright: asiainfo
 */
public class Manager {
	private HashMap showcase = new HashMap();

	public void register(String name,Product proto) {
		showcase.put(name,proto);
	}

	public Product create(String protoName) {
		Product product =  (Product) showcase.get(protoName);
		return product.createClone();
	}
}
