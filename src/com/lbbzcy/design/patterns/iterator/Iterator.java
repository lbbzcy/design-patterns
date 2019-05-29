package com.lbbzcy.design.patterns.iterator;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-23 14:06
 * @Copyright: asiainfo
 */
public interface Iterator {

    /**
     * 确认接下来是否可以调用next方法
     * @return
     */
    public abstract boolean hasNext();

    /**
     * 返回当前元素，并指向下一个元素。
     * @return
     */
    public abstract Object next();
}
