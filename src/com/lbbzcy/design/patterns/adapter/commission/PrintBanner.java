package com.lbbzcy.design.patterns.adapter.commission;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-23 17:22
 * @Copyright: asiainfo
 */
public class PrintBanner extends Print {

	private Banner banner;

	public PrintBanner(String content) {
		this.banner = new Banner(content);
	}

	@Override
	public void printWeak() {
		banner.showWithParen();
	}

	@Override
	public void printStorng() {
		banner.showWithAster();
	}
}
