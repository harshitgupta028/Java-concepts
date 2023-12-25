package Interface;

class Main{
    public static void main(String[] args) {

        Car car = new Car();

        boolean status = car.applyBreak(true);

        System.out.println("Status of handbrake is "+ status);

        car.setHandBreakApplied(false);

        System.out.println("Status of handbrake is "+ car.isHandBreakApplied);
    }
}