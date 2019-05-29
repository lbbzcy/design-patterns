package com.lbbzcy.design.patterns.adapter.extend;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-23 16:54
 * @Copyright: asiainfo
 */
public class Banner {
    private String content;

    public Banner(String content) {
        this.content = content;
    }

    public void showWithParen() {
        System.out.println("(" + content + ")");
    }

    public void showWithAster() {
        System.out.println("*" + content + "*");
    }
}
