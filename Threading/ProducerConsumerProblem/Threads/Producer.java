package Threading.ProducerConsumerProblem.Threads;

import Threading.ProducerConsumerProblem.Company;

public class Producer extends Thread{

    private Company company;

    public Producer(Company c){
        this.company = c;
    }

    public void run(){
        int i = 1;
        while (true) {
            this.company.produce_item(i);
            i++;

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}