package com.example.test_prodject_for_playtox_1.model.threads;

import com.example.test_prodject_for_playtox_1.model.Account;

public class SecondMoneyTransfer implements Runnable {
    public void run() {

        Account acc2 = new Account();
        String id = acc2.getId();
        acc2.setMoney(10000);

        for (int i = 0; i < 100; i++) {
            System.out.println(id + " Второй поток " );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}