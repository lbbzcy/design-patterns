package com.lbbzcy.design.patterns.mediator;


import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-06-04 16:37
 * @Copyright: asiainfo
 */
public class ColleagueCheckBox extends Checkbox implements ItemListener,Colleague {

	private Mediator mediator;

	public ColleagueCheckBox(String caption, CheckboxGroup group, boolean state) throws HeadlessException {
		super(caption, group, state);
	}

	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public void setColleagueEnabled(boolean enabled) {
		setEnabled(enabled);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		mediator.colleagueChanged();
	}
}
