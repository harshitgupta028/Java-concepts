package ComparingObjects;

import ComparingObjects.userDefinedObj.Employee;

public class Main {
    
    public static void main(String[] args) {
        
        Double x = new Double(12.22222);
        Long y = new Long(9887544);

        System.out.println(x.equals(y));
        System.out.println(x.equals(12.22222));

        // compare user defined objects
        Employee empOne  = new Employee("Harshit", "harshit@test.com", 999999l);
        Employee empTwo  = new Employee("Harshit", "harshit@test.com", 999999l);

        System.out.println(empOne.equals(empTwo));

    }
}
