package Homework_08_Task_05;

class FirstResource {

    public synchronized void methodA(SecondResource secondResource) {
        System.out.println();
        System.out.println("Потік 1 захопив ресурс класу FirstResource");

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Потік 1 намагається захопити ресурс класу SecondResource...");
        secondResource.methodB(this);
    }

    public synchronized void last() {
        System.out.println("Викликаний метод last () у ResourceA");
    }
}
