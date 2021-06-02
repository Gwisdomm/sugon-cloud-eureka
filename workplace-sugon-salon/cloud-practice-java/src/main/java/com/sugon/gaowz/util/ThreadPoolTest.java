package com.sugon.gaowz.util;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 线程池测试
 */
public class ThreadPoolTest {

    public static void main(String[] args) throws InterruptedException {
        Long start = System.currentTimeMillis();
        Random random = new Random();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 100000; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    random.nextInt();
                }
            });
        }
        //两者配合使用关闭线程池
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);
        System.out.println("时间" + (System.currentTimeMillis() - start));
    }
}
