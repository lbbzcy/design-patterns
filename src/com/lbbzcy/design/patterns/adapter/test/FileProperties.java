package com.lbbzcy.design.patterns.adapter.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-24 10:06
 * @Copyright: asiainfo
 */
public class FileProperties extends Properties implements FileIO {


	@Override
	public void readFromFile(String fileName) throws IOException {
		load(new FileInputStream(fileName));
	}

	@Override
	public void writeToFile(String fileName) throws IOException {
		store(new FileOutputStream(fileName),"#Write by FileProperties");
	}

	@Override
	public void setValue(String key, String value) {
		setProperty(key,value);
	}

	@Override
	public String getValue(String key) {
		return getProperty(key);
	}
}
