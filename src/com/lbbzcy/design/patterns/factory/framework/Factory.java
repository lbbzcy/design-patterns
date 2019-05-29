package com.lbbzcy.design.patterns.factory.framework;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-24 15:16
 * @Copyright: asiainfo
 */
public abstract class Factory {

	public final Product create(String owner,String number) {
		Product product = createProduct(owner,number);
		registerProduct(product);
		return product;
	}

	protected abstract Product createProduct(String owner,String number);
	protected abstract void registerProduct(Product product);
}
