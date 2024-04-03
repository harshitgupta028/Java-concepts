package Threading.ProducerConsumerProblem;

import Threading.ProducerConsumerProblem.Threads.Consumer;
import Threading.ProducerConsumerProblem.Threads.Producer;

public class Main {
    
    public static void main(String[] args) {
        
        Company c = new Company();

        Producer producer = new Producer(c);
        Consumer consumer = new Consumer(c);

        producer.start();
        consumer.start();

    }
}
