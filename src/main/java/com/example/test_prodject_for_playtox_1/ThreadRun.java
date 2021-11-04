package com.example.test_prodject_for_playtox_1;

import com.example.test_prodject_for_playtox_1.model.threads.FirstMoneyTransfer;
import com.example.test_prodject_for_playtox_1.model.threads.FourthMoneyTransfer;
import com.example.test_prodject_for_playtox_1.model.threads.SecondMoneyTransfer;
import com.example.test_prodject_for_playtox_1.model.threads.ThirdMoneyTransfer;

public class ThreadRun {
    public void threadRun() {
        FirstMoneyTransfer firstMoneyTransfer = new FirstMoneyTransfer();
        Thread firstMoneyTransferThread = new Thread(firstMoneyTransfer);
        firstMoneyTransferThread.start();

        SecondMoneyTransfer secondMoneyTransfer = new SecondMoneyTransfer();
        Thread secondMoneyTransferThread = new Thread(secondMoneyTransfer);
        secondMoneyTransferThread.start();

//        ThirdMoneyTransfer thirdMoneyTransfer = new ThirdMoneyTransfer();
//        Thread thirdMoneyTransferThread = new Thread(thirdMoneyTransfer);
//        thirdMoneyTransferThread.start();
//
//        FourthMoneyTransfer fourthMoneyTransfer = new FourthMoneyTransfer();
//        Thread fourthMoneyTransferThread = new Thread(fourthMoneyTransfer);
//        fourthMoneyTransferThread.start();
    }
}