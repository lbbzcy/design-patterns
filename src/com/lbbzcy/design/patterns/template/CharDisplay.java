package com.lbbzcy.design.patterns.template;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-24 11:18
 * @Copyright: asiainfo
 */
public class CharDisplay extends AbstractDisplay {

	private char ch;

	public CharDisplay(char ch) {
		this.ch = ch;
	}

	@Override
	public void open() {
    	System.out.print("<<");
	}

	@Override
	public void print() {
    	System.out.print(ch);
	}

	@Override
	public void close() {
    	System.out.println(">>");
	}
}
