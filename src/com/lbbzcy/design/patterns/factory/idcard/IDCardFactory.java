package com.lbbzcy.design.patterns.factory.idcard;

import com.lbbzcy.design.patterns.factory.framework.Factory;
import com.lbbzcy.design.patterns.factory.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-24 16:13
 * @Copyright: asiainfo
 */
public class IDCardFactory extends Factory {

	private List owners = new ArrayList();

	@Override
	protected Product createProduct(String owner,String number) {
		return new IDCard(owner,number);
	}

	@Override
	protected void registerProduct(Product product) {
		owners.add(((IDCard)product).getOwner());
	}

	public List getOwners() {
		return owners;
	}
}
