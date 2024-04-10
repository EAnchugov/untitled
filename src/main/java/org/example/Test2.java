//package org.example;
//
//public class Test2 extends Thread{
//    public void run(){
//        for (int i = 0; i < 3; i++) {
//            System.out.println("A");
//            System.out.println("B");
//        }
//    }
//}
//class ThreadDemo extends Thread{
//    @Override
//    public void run() {
//        for (int i = 0; i < 3; i++) {
//            System.out.println("C");
//            System.out.println("D");
//        }
//    }
//
//    public static void main(String[] args) {
//        Test2 t1 = new Test2();
//        ThreadDemo t2 = new ThreadDemo();
//        t1.start();
//        t2.start();
//    }
//}