package com.lbbzcy.design.patterns.strategy;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-29 09:35
 * @Copyright: asiainfo
 */
public class Hand {
	public static final int HANDVALUE_GUU = 0;
	public static final int HANDVALUE_CHO = 1;
	public static final int HANDVALUE_PAA = 2;

	public static final Hand[] hand = {
		new Hand(HANDVALUE_GUU),
		new Hand(HANDVALUE_CHO),
		new Hand(HANDVALUE_PAA),
	};
	private static final String[] name = {
			"石头","剪刀","布",
	};

	private int handvalue;
	private Hand(int handvalue) {
		this.handvalue = handvalue;
	}

	public static Hand getHand(int handvalue) {
		return hand[handvalue];
	}

	public

}
