package com.example.test_prodject_for_playtox_1.model;
public class SomeClass implements Runnable {

    private Account account1;
    private Account account2;

    public SomeClass(Account account1, Account account2) {
        this.account1 = account1;
        this.account2 = account2;
    }

    public void transferMoney() {
        int transfer;

        for (int i = 0; i < 20; i++) {
            transfer = (int) (Math.random() * 3000);
            if (account1.getMoney() < transfer) {
                int money = account1.getMoney();
                account1.setMoney(0);
                account2.setMoney(account2.getMoney() + money);
                System.out.println("Со счета " + account1.getId() + " cписан остаток " + money);
                System.out.println("На счет " + account2.getId() + " зачислен остаток " + money);
                break;
            }

            account1.setMoney(account1.getMoney() - transfer);
            System.out.println("Со счета " + account1.getId() + " списано " + transfer);
            account2.setMoney(account2.getMoney() + transfer);
            System.out.println("На счет " + account2.getId() + " зачислено " + transfer);

            try {
                Thread.sleep((long) ((Math.random() * (2000 - 1000)) + 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("На счете 1 " + account1.getMoney());
        System.out.println("На счете 2 " + account2.getMoney());
    }

    @Override
    public void run() {
        transferMoney();
    }

}
