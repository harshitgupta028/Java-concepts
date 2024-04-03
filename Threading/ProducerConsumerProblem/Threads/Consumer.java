package Threading.ProducerConsumerProblem.Threads;

import Threading.ProducerConsumerProblem.Company;

public class Consumer extends Thread {

    private Company company;

    public Consumer(Company c){
        this.company = c;
    }
    
    public void run(){
        while (true) {
            this.company.consume_item();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
