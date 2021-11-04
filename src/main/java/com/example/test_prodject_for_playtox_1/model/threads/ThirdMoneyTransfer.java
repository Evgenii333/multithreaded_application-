package com.example.test_prodject_for_playtox_1.model.threads;

import com.example.test_prodject_for_playtox_1.model.Account;

public class ThirdMoneyTransfer implements Runnable{
    @Override
    public void run() {
        Account acc3 = new Account();
        String id = acc3.getId();
        int money = (int) acc3.setMoney(10000);
        for (int i = 0; i < 100; i++) {
            money -=Math.random();
            System.out.println(id + " Третий поток " + money);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
