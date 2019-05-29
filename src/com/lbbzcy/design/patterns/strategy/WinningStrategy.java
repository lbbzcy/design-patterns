package com.lbbzcy.design.patterns.strategy;

import java.util.Random;

/**
 * @Description
 * @Company asiainfo
 * @User zhucy@asiainfo.com
 * @Date 2019/5/29 16:00
 */
public class WinningStrategy implements Strategy {

    private Random random;
    private boolean won = false;
    private Hand  prevHand;

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
