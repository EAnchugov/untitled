//package org.example;
//
//class Test implements Runnable{
//    int x=0,y=0;
//    int addX(){
//        x++;
//        return x;
//    }
//    int addY(){
//        y++;
//        return y;
//    }
//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(Thread.currentThread().getName() + ": " + addX()+ " " + addY());
//        }
//    }
//
//    public static void main(String[] args) {
//        Test obj1 = new Test();
//        Test obj2 = new Test();
//        Thread thread1 = new Thread(obj1);
//        Thread thread2 = new Thread(obj2);
//        thread1.start();
//        thread2.start();
//    }
//}
