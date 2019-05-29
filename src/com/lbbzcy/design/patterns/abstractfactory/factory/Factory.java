package com.lbbzcy.design.patterns.abstractfactory.factory;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-28 14:29
 * @Copyright: asiainfo
 */
public abstract class Factory {
	public static Factory getFactory(String classname) {
		Factory factory = null;
		try {
			factory = (Factory)Class.forName(classname).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.err.println("没有找到" + classname + "类");
		}
		return factory;
	}

	public abstract Link createLink(String caption,String url);
	public abstract Tray createTray(String caption);
	public abstract Page createPage(String title,String author);
}
