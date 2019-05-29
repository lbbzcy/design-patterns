package com.lbbzcy.design.patterns.strategy;

/**
 * @Description
 * @Company asiainfo
 * @User zhucy@asiainfo.com
 * @Date 2019/5/29 16:44
 */
public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usaeg: java Main randomseed1 randomseed2");
            System.out.println("Example: java Main 314 15");
        }

        int seed1 = Integer.parseInt(args[0]);
        int seed2 = Integer.parseInt(args[1]);

        Player player1 = new Player("Trao",new WinningStrategy(seed1));
        Player player2 = new Player("Hana",new PropStrategy(seed2));

        for (int i = 0 ; i < 1000; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();
            if (nextHand1.isStrongThan(nextHand2)) {
                System.out.println("Winner:" + player1);
                player1.win();
                player2.lose();
            } else if (nextHand2.isStrongThan(nextHand1)) {
                System.out.println("Winner:" + player2);
                player1.lose();
                player2.win();
            } else {
                System.out.println("Even:");
                player1.even();
                player2.even();
            }
        }
        System.out.println("Total Result:");
        System.out.println(player1.toString());
        System.out.println(player2.toString());
    }
}