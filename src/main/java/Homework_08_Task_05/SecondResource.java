package Homework_08_Task_05;

class SecondResource {

    public synchronized void methodB(FirstResource firstResource) {
        System.out.println("Поток 2: захватил SecondResource");

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Поток 2: пытается захватить FirstResource...");
        firstResource.last();
    }

    public synchronized void last() {
        System.out.println("Вызван метод last() у SecondResource");
    }
}