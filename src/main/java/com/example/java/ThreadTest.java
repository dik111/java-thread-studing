package com.example.java;

/**
 * Desription: 多线程的创建，方式一：继承于Thread类
 * 1、创建一个继承于Thread类的子类
 * 2、重写Thread类的run()  --> 将此线程执行的操作声明在run()中
 * 3、创建thread类的子类对象
 * 4、通过此对象对用start()
 *
 * 例子：遍历100以内的所有的偶数
 *
 * @ClassName ThreadTest
 * @Author Zhanyuwei
 * @Date 2020/10/12 9:22 下午
 * @Version 1.0
 **/

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        System.out.println("hello");
    }


}
