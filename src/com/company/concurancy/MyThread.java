package com.company.concurancy;

public class MyThread extends Thread {
    private int id;
    public MyThread(int id) {
    this.id = id;
    }

    @Override
    public void run(){
        System.out.println("hello from"+ this);

    }

    @Override
    public String toString() {
        return "MyThread{" +
                "id=" + id +
                '}';
    }
}
