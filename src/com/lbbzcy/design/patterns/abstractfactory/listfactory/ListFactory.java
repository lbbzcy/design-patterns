package com.lbbzcy.design.patterns.abstractfactory.listfactory;

import com.lbbzcy.design.patterns.abstractfactory.factory.Factory;
import com.lbbzcy.design.patterns.abstractfactory.factory.Link;
import com.lbbzcy.design.patterns.abstractfactory.factory.Page;
import com.lbbzcy.design.patterns.abstractfactory.factory.Tray;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-28 15:05
 * @Copyright: asiainfo
 */
public class ListFactory extends Factory {
	@Override
	public Link createLink(String caption, String url) {
		return new ListLink(caption,url);
	}

	@Override
	public Tray createTray(String caption) {
		return new ListTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		return new ListPage(title, author);
	}
}
