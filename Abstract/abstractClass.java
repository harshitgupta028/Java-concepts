package Abstract;

public abstract class abstractClass {

    // Abstract class are the combination of interface and a class

    public abstract void employeeName();

    public int genrateEmployeeId(){
        int employeeId = (int)(Math.random()*1000000);
        return employeeId;
    }

}
