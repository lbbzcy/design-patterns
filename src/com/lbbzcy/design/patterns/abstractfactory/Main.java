package com.lbbzcy.design.patterns.abstractfactory;

import com.lbbzcy.design.patterns.abstractfactory.factory.Factory;
import com.lbbzcy.design.patterns.abstractfactory.factory.Link;
import com.lbbzcy.design.patterns.abstractfactory.factory.Page;
import com.lbbzcy.design.patterns.abstractfactory.factory.Tray;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-28 14:34
 * @Copyright: asiainfo
 */
public class Main {
	public static void main(String[] args) {
	  //
		if (args.length != 1){
      		System.out.println("Usage:java main class.name.of.ConcreteFactory");
      		System.out.println("Example 1:java main listfactory.ListFactory");
      		System.out.println("Example 2:java main tablefactory.TableFactory");
      		System.exit(0);
		}

		Factory factory = Factory.getFactory(args[0]);

		Link people = factory.createLink("人民日报","http://www.people.com.cn/");
		Link gmw = factory.createLink("光明日报","http://www.gmw.cn/");

		Link us_yahoo = factory.createLink("Yahoo!","http://www.yahoo.com/");
		Link jp_yahoo = factory.createLink("Yahoo!Japan","http://www.yahoo.co.jp/");

		Link excite = factory.createLink("Excite","http://www.excite.com/");
		Link google = factory.createLink("Google","http://www.google.com/");

		Tray traynews = factory.createTray("日报");
		traynews.add(people);
		traynews.add(gmw);

		Tray trayyahoo = factory.createTray("Yahoo");
		trayyahoo.add(us_yahoo);
		trayyahoo.add(jp_yahoo);

		Tray traysearch = factory.createTray("检索引擎");
		traysearch.add(trayyahoo);
		traysearch.add(excite);
		traysearch.add(google);

		Page page = factory.createPage("LinkPage","朱春雨");
		page.add(traynews);
		page.add(trayyahoo);
		page.add(traysearch);
		page.output();

	}
}
