package com.example.test_prodject_for_playtox_1.model;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Текущий поток исполнения " + t);
        t.setName("myThread");
        System.out.println("Имя потока после изменения " + t);

        try {
            for(int i = 5; i>0; i--) {
                System.out.println(i);
                Thread.sleep((long) Math.random());
            }
        }
        catch (InterruptedException e){
            System.out.println("Поток прерван");
        }

    }
}
