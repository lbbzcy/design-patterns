package com.lbbzcy.design.patterns.mediator;


import java.awt.Button;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-06-04 16:18
 * @Copyright: asiainfo
 */
public class ColleagueButton extends Button implements Colleague {
	private Mediator mediator;

	public ColleagueButton(String caption) {
		super(caption);
	}

	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public void setColleagueEnabled(boolean enabled) {
		setEnabled(enabled);
	}
}
