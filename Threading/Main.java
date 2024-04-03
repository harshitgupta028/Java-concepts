package Threading;

public class Main {
    
    public static void main(String[] args) {
        
        // First way to create thread using Runnable interface.

        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.start();


        // Second way to create thread using Helper class Thread.

        MyAnotherThread myAnotherThread = new MyAnotherThread();
        myAnotherThread.start();
    }
}
