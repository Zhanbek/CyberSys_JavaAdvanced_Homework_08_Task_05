package Homework_08_Task_05;

class FirstResource {

    public synchronized void methodA(SecondResource secondResource) {
        System.out.println("Поток 1: захватил FirstResource");

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Поток 1: пытается захватить SecondResource...");
        secondResource.methodB(this);
    }

    public synchronized void last() {
        System.out.println("Вызван метод last() у ResourceA");
    }
}
