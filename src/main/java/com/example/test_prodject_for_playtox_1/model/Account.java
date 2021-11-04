package com.example.test_prodject_for_playtox_1.model;

public class Account {
    public String id = new GeneratedID().generatedID();
    public int money;

    public Account(String id, int money) {
        this.id = id;
        this.money = money;
    }

    public Account() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMoney() {
        return money;
    }

    public double setMoney(int money) {
        this.money = money;
        return money;
    }
}
