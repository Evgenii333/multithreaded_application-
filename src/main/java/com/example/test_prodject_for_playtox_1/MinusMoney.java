package com.example.test_prodject_for_playtox_1;

import com.example.test_prodject_for_playtox_1.model.Account;

public class MinusMoney {
   public int minusMoney() {
       Account account = new Account();
       int x = (int) (account.setMoney(1000) - Math.random()*1000);
       return x;
   }
}
