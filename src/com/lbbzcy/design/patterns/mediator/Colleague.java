package com.lbbzcy.design.patterns.mediator;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-06-04 16:09
 * @Copyright: asiainfo
 */
public interface Colleague {
	public abstract void setMediator(Mediator mediator);
	public abstract void setColleagueEnabled(boolean enabled);
}
