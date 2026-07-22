package org.example;

import org.example.Data.FactorialTask;

import java.util.concurrent.ForkJoinPool;

public class ThirdEx {
    public static void main(String[] args){
        int n = 10;

        ForkJoinPool forkJoinPool = new ForkJoinPool();
        FactorialTask task = new FactorialTask(n);

        long result = forkJoinPool.invoke(task);

        System.out.println("Факториал " + n + "! = " + result);
    }
}
