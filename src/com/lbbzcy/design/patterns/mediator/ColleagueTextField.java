package com.lbbzcy.design.patterns.mediator;


import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-06-04 16:23
 * @Copyright: asiainfo
 */
public class ColleagueTextField extends TextField implements TextListener,Colleague {
	private Mediator mediator;

	public ColleagueTextField(String text, int columns) throws HeadlessException {
		super(text, columns);
	}

	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public void setColleagueEnabled(boolean enabled) {
		setEnabled(enabled);
		setBackground(enabled ? Color.white : Color.lightGray);
	}

	public void textValueChanged(TextEvent e) {
		mediator.colleagueChanged();
	}
}
