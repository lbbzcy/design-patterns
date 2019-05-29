package com.lbbzcy.design.patterns.adapter.test;

import java.io.IOException;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-24 10:06
 * @Copyright: asiainfo
 */
public class Main {
	  public static void main(String[] args) {
		  //
		  FileIO f = new FileProperties();

		  try {
			  f.readFromFile("/Users/zhucy/Documents/personal/project/design-patterns/src/com/lbbzcy/design/patterns/adapter/test/file.txt");
			  f.setValue("year","2019");
			  f.setValue("month","5");
			  f.setValue("day","24");
			  f.writeToFile("/Users/zhucy/Documents/personal/project/design-patterns/src/com/lbbzcy/design/patterns/adapter/test/newFile.txt");
		  } catch (IOException e) {
			  e.printStackTrace();
		  }

	  }
}
