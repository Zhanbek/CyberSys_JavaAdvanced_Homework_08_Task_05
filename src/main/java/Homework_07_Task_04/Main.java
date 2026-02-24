package Homework_07_Task_04;

public class Main {

    public static void main(String[] args) {

        FirstResource firstResource = new FirstResource();
        SecondResource secondResource = new SecondResource();

        Thread t1 = new Thread(() -> firstResource.methodA(secondResource));
        Thread t2 = new Thread(() -> secondResource.methodB(firstResource));

        t1.start();
        t2.start();
    }
}