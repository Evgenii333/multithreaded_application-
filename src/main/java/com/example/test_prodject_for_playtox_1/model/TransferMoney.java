package com.example.test_prodject_for_playtox_1.model;
import org.apache.log4j.Logger;

public class TransferMoney implements Runnable {
    private static final Logger log = Logger.getLogger(TransferMoney.class);

    private Account account1;
    private Account account2;

    public TransferMoney(Account account1, Account account2) {
        this.account1 = account1;
        this.account2 = account2;
    }

    public void transferMoney() {
        int transfer;
        for (int i = 0; i < 30; i++) {
            transfer = (int) (Math.random() * 3000);
            if (account1.getMoney() < transfer) {
                int money = account1.getMoney();
                account1.setMoney(0);
                log.info("Со счета " + account1.getId() + " cписан остаток " + money);
                account2.setMoney(account2.getMoney() + money);
                log.info("На счет " + account2.getId() + " зачислен остаток " + money);
                break;
            }

            account1.setMoney(account1.getMoney() - transfer);
            log.info("Со счета " + account1.getId() + " списано " + transfer);
            account2.setMoney(account2.getMoney() + transfer);
            log.info("На счет " + account2.getId() + " зачислено " + transfer);

            try {
                Thread.sleep((long) ((Math.random() * (2000 - 1000)) + 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        log.info("На счете 1 " + account1.getMoney());
        log.info("На счете 2 " + account2.getMoney());
    }

    @Override
    public void run() {
        transferMoney();
    }

}
