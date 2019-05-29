package com.lbbzcy.design.patterns.singleton;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-27 10:13
 * @Copyright: asiainfo
 */
public class Triple {

	private static Triple[] triples = new Triple[] {
			new Triple(0),
			new Triple(1),
			new Triple(2),
	};

	private int id;

	private Triple(int id) {
		System.out.println("The instance " + id + "is created");
		this.id = id;
	}

	public static Triple getInstance(int id) {
		return new Triple(id);
	}

	@Override
	public String toString() {
		return "[Triple id=" + id + "].";
	}
}
