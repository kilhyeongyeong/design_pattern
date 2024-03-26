package com.study.design_pattern.singleton;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Singleton {

    private static volatile Singleton INSTANCE;

    public static Singleton getInstance() {
        if(INSTANCE == null){
            synchronized (Singleton.class){
                if(INSTANCE == null){
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}

class HelloWorld {
    public static void main(String[] args){
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        if(a == b){
            System.out.println(true);
        }

        //--------------Thread Test-----------------------------

        Thread thread1 = new Thread(() -> {
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton);
        });

        Thread thread2 = new Thread(() -> {
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton);
        });

        Thread thread3 = new Thread(() -> {
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton);
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
