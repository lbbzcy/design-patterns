package com.lbbzcy.design.patterns.singleton;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-27 10:04
 * @Copyright: asiainfo
 */
public class TicketMaker {
	private int ticket = 1000;

	private TicketMaker ticketMaker = new TicketMaker();

	private TicketMaker() {

	}

	public int getNextTicketNumber() {
		return ticket++;
	}

	public TicketMaker getInstance() {
		return ticketMaker;
	}
}
