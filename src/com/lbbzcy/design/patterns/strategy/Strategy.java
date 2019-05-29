package com.lbbzcy.design.patterns.strategy;

/**
 * @Description
 * @Company asiainfo
 * @User zhucy@asiainfo.com
 * @Date 2019/5/29 15:37
 */
public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
