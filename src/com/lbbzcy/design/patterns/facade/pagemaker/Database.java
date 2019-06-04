package com.lbbzcy.design.patterns.facade.pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-06-04 10:29
 * @Copyright: asiainfo
 */
public class Database {
	private Database() {

	}

	public static Properties getProperties(String dbname) {
		String filename = dbname + ".txt";
		Properties prop = new Properties();

		try {
			prop.load(new FileInputStream(filename));
		} catch (IOException e) {
			System.out.println("Warning:" + filename + " is not found.");
		}

		return prop;
	}
}
