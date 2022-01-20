package com.qiao.liangfang.juc.threadlocal;


/**
 *ThreadLocal 干什么？怎么用？
 *
 */
public class ThreadLocalTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            Thread thread = new Thread(()->{
                ThreadT.addPerson("qiao_"+ finalI, finalI);
                final Person persion = ThreadT.getPersion();
                System.out.println(Thread.currentThread() + " : " + persion.toString());
            },"thread"+i);
            thread.start();
        }
    }
}
