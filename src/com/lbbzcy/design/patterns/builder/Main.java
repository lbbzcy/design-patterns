package com.lbbzcy.design.patterns.builder;

import javax.swing.*;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-27 17:03
 * @Copyright: asiainfo
 */
public class Main {
	public static void main(String[] args) {
		FrameBuilder frameBuilder = new FrameBuilder();
		Director director = new Director(frameBuilder);
		director.construct();
		JFrame frame = frameBuilder.getResult();
		frame.setVisible(true);



//		if (args.length != 1) {
//			usage();
//			System.exit(0);
//		}
//		if (args[0].equals("plain")) {
//			TextBuilder textBuilder = new TextBuilder();
//			Director director = new Director(textBuilder);
//			director.construct();
//			String result  = textBuilder.getResult();
//			System.out.println(result);
//		} else if (args[0].equals("html")) {
//			HTMLBuilder htmlbuilder = new HTMLBuilder();
//			Director director = new Director(htmlbuilder);
//			director.construct();
//			String filename = htmlbuilder.getResult();
//      		System.out.println(filename + "文档编写完成");
//		} else {
//			usage();
//			System.exit(0);
//		}
	}
	public static void usage() {
		System.out.println("Usage: java Main plain    编写纯文本文档");
		System.out.println("Usage: java Main html     编写HTML文档");
	}
}
