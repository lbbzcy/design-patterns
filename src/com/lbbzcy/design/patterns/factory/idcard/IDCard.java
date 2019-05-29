package com.lbbzcy.design.patterns.factory.idcard;

import com.lbbzcy.design.patterns.factory.framework.Product;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-24 16:10
 * @Copyright: asiainfo
 */
public class IDCard extends Product {

	private String owner;
	private String number;

	IDCard(String owner,String number) {
    	System.out.println("制作" + owner + "的ID卡,编号为" + number);
    	this.owner = owner;
    	this.number = number;
	}

	@Override
	public void use() {
    	System.out.println("使用" + owner + "的ID卡");
	}

	@Override
	public void saveRel() {
    	System.out.println("保存关系");
	}

	public String getOwner() {
		return owner;
	}

	public String getNumber() {
		return number;
	}
}
