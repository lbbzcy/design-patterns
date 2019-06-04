package com.lbbzcy.design.patterns.facade.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-06-04 10:43
 * @Copyright: asiainfo
 */
public class PageMaker {
	private PageMaker() {

	}
	public static void makeWelcomePage(String mailaddr,String filename) {

		try {
			Properties mailprop = Database.getProperties("/Users/zhucy/Documents/personal/project/design-patterns/src/com/lbbzcy/design/patterns/facade/maildata");
			String username = mailprop.getProperty(mailaddr);
			HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
			writer.title("Welcome to " + username + "'s page!");
			writer.paragraph(username + "欢迎来到" + username + "的主页。");
			writer.paragraph( "等着你的邮件哦！");
			writer.mailto(mailaddr,username);
			writer.close();
			System.out.println(filename + " is created for " + mailaddr + "(" + username + ")");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
