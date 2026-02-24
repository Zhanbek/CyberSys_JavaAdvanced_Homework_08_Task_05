package Homework_08_Task_05;

class SecondResource {

    public synchronized void methodB(FirstResource firstResource) {
        System.out.println("Потік 2 захопив ресурс класу SecondResource");
        System.out.println();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Потік 2 намагається захопити ресурс класу FirstResource...");
        firstResource.last();
    }

    public synchronized void last() {
        System.out.println("Викликаний метод last () у SecondResource");
    }
}