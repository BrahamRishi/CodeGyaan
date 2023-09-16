class SharedResource {
    private int counter = 0;
    public synchronized void increment() {
        counter++;
    }

    public synchronized int getValue() {
        return counter;
    }
}

class MyThread extends Thread {
    private SharedResource sharedResource;

    public MyThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            sharedResource.increment();
        }
    }
}

public class ex7 {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        MyThread thread1 = new MyThread(sharedResource);
        MyThread thread2 = new MyThread(sharedResource);
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int finalValue = sharedResource.getValue();
        System.out.println("Final Counter Value: " + finalValue);
    }
}

