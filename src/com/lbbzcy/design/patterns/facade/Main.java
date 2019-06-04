package com.lbbzcy.design.patterns.facade;

import com.lbbzcy.design.patterns.facade.pagemaker.PageMaker;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-06-04 10:29
 * @Copyright: asiainfo
 */
public class Main {
	public static void main(String[] args) {
		PageMaker.makeWelcomePage("hyuki@hyuki.com","welcome.html");
	}
}
