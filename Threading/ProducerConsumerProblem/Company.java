package Threading.ProducerConsumerProblem;

public class Company {

    private int n;
    private boolean isProduced = false;

    // establish communication b/w threads

    // if isProduced = false i.e. produce_item will run
    // if isProduced = true i.e. consume_item will run
    // In case of isProduced = false consume thread is executing we should make it wait() and notify()
    synchronized public void produce_item(int n){
        if (isProduced == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.n = n;
        System.out.println("Produced: " + this.n);
        isProduced = true;
        notify();
    }

    synchronized public int consume_item(){
        if (isProduced == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: " + this.n);
        isProduced = false;
        notify();
        return this.n;
    }
}
