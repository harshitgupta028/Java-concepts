package Threading;

public class MyAnotherThread extends Thread {
    
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Value of i "+ i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
