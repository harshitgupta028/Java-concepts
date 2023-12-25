import Abstract.InfosysEmployee;
import Abstract.TCSEmployee;
import Interface.Car;

class Main{
    public static void main(String[] args) {

        // Interface Example
        
        Car car = new Car();
        boolean status = car.applyBreak(true);

        System.out.println("Status of handbrake is "+ status);

        car.setHandBreakApplied(false);
        System.out.println("Status of handbrake is "+ car.isHandBreakApplied);


        // Abstract Example

        TCSEmployee tcsEmp = new TCSEmployee();
        tcsEmp.setName("Harshit Gupta");
        System.out.println(tcsEmp.Name + " works in "+ tcsEmp.orgName + ". His employee id is "+ tcsEmp.genrateEmployeeId());

        InfosysEmployee infiEmp = new InfosysEmployee();
        infiEmp.setName("Druvh Rathi");
        System.out.println(infiEmp.Name + " works in " + infiEmp.orgName + ". His employee id is " + infiEmp.genrateEmployeeId());
    }
}