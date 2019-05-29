package com.lbbzcy.design.patterns.adapter.commission;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-23 17:21
 * @Copyright: asiainfo
 */
public class Banner {
	private String content;

	public Banner(String content) {
		this.content = content;
	}

	public void showWithParen() {
		System.out.println("(" + content + ")");
	}

	public void showWithAster() {
		System.out.println("*" + content + "*");
	}
}
