package com.example.test_prodject_for_playtox_1;
import com.example.test_prodject_for_playtox_1.model.Account;
import com.example.test_prodject_for_playtox_1.model.SomeClass;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class AddAccount {
    private static final List<Account> ADD_ACCOUNT = new CopyOnWriteArrayList<>();
    private static final int COUNT_ACCOUNT = 12;
    private static final int START_MONEY = 10000;

    private static void generateAccount() {
        for (int i = 0; i < COUNT_ACCOUNT; i++) {
            String id = "a" + i;
            ADD_ACCOUNT.add(new Account(id, START_MONEY));
        }
    }

    public void generateThreads() {
        generateAccount();
        for(int i = 0; i < ADD_ACCOUNT.size(); i = i + 2){
            SomeClass someClass = new SomeClass(ADD_ACCOUNT.get(i), ADD_ACCOUNT.get(i+1));
            Thread thread = new Thread(someClass);
            thread.start();
        }
    }
}
