package com.example.test_prodject_for_playtox_1.model.threads;

import com.example.test_prodject_for_playtox_1.model.Account;

public class FirstMoneyTransfer implements Runnable{
    @Override
    public void run() {
        Account acc1 = new Account();
        String id = acc1.getId();
        acc1.setMoney(10000);
        for (int i = 0; i < 100; i++) {
            System.out.println(id + " Первый поток " + acc1.getMoney());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
