package com.lbbzcy.design.patterns.adapter.extend;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-23 16:57
 * @Copyright: asiainfo
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String content) {
        super(content);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
