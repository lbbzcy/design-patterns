package com.lbbzcy.design.patterns.adapter.test;

import java.io.IOException;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-24 10:03
 * @Copyright: asiainfo
 */
public interface FileIO {
	public void readFromFile(String fileName) throws IOException;
	public void writeToFile(String fileName) throws IOException;
	public void setValue(String key,String value);
	public String getValue(String key);
}
