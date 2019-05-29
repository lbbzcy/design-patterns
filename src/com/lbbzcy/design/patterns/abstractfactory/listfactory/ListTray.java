package com.lbbzcy.design.patterns.abstractfactory.listfactory;

import com.lbbzcy.design.patterns.abstractfactory.factory.Item;
import com.lbbzcy.design.patterns.abstractfactory.factory.Tray;

import java.util.Iterator;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-28 15:11
 * @Copyright: asiainfo
 */
public class ListTray extends Tray {


	public ListTray(String caption) {
		super(caption);
	}

	@Override
	public String makeHTML() {
		StringBuffer buffer = new StringBuffer();

		buffer.append("<li>\n");
		buffer.append(caption+"\n");
		buffer.append("<ul>\n");
		Iterator it = tray.iterator();
		while (it.hasNext()) {
			Item item = (Item)it.next();
			buffer.append(item.makeHTML());
		}
		buffer.append("</ul>\n");
		buffer.append("</li>\n");

		return buffer.toString();
	}
}
