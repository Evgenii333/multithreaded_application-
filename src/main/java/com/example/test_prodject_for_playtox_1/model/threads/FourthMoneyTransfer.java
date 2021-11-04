package com.example.test_prodject_for_playtox_1.model.threads;

import com.example.test_prodject_for_playtox_1.MinusMoney;
import com.example.test_prodject_for_playtox_1.model.Account;

public class FourthMoneyTransfer implements Runnable{
    @Override
    public void run() {
        Account acc4 = new Account();
        String id = acc4.getId();
        int money = (int) acc4.setMoney(10000);
        for (int i = 0; i < 100; i++) {
          acc4.money -= Math.random();
            System.out.println(id + " Четвертый поток " + money);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
