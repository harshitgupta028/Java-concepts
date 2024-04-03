package Threading;

public class ThreadOperations {
    
    public static void main(String[] args) {
        
        System.out.println("Program started..........");

        Thread th = Thread.currentThread();

        // Get thread name
        String thName = th.getName();
        System.out.println(thName);

        // Set thread name
        th.setName("Java Main thread");
        System.out.println(th.getName());

        // sleep() this will throw checked exception so handel it 
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // get thread id
        System.out.println(th.threadId());
        MyAnotherThread anotherThread = new MyAnotherThread();
        System.out.println(anotherThread.threadId());


        System.out.println("Program ended........");
    }
}
