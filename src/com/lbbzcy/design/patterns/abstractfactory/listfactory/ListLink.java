package com.lbbzcy.design.patterns.abstractfactory.listfactory;

import com.lbbzcy.design.patterns.abstractfactory.factory.Link;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-28 15:06
 * @Copyright: asiainfo
 */
public class ListLink extends Link {

	public ListLink(String caption, String url) {
		super(caption, url);
	}

	@Override
	public String makeHTML() {
		return "<li><a href=\"" + url + "\">" + caption + "</a></li>\n";
	}
}
