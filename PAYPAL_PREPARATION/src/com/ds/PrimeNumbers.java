package com.ds;



public class PrimeNumbers {

    public static void main(String... args) {
    	Print print = new Print();
        Thread t1 = new Thread(new TaskPrime(print, 10, false));
        Thread t2 = new Thread(new TaskPrime(print, 10, true));
        t1.start();
        t2.start();
    }

}

class TaskPrime implements Runnable {

    private int max;
    private Print print;
    private boolean isEvenNumber;

    TaskPrime(Print print, int max, boolean isEvenNumber) {
        this.print = print;
        this.max = max;
        this.isEvenNumber = isEvenNumber;
    }

    @Override
    public void run() {

        //System.out.println("Run method");
        int number = isEvenNumber == true ? 2 : 1;
        while (number <= max) {

            if (isEvenNumber) {
                //System.out.println("Even :"+ Thread.currentThread().getName());
                print.printEven(number);
                //number+=2;
            } else {
                //System.out.println("Odd :"+ Thread.currentThread().getName());
                print.printOdd(number);
                // number+=2;
            }
            number += 2;
        }

    }

}

class Print {

    boolean isOdd = false;

    synchronized void printEven(int number) {

        while (isOdd == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Even:" + number);
        isOdd = false;
        notifyAll();
    }

    synchronized void printOdd(int number) {
        while (isOdd == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Odd:" + number);
        isOdd = true;
        notifyAll();
    }

}
