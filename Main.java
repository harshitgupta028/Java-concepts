import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import Abstract.InfosysEmployee;
import Abstract.TCSEmployee;
import Interface.Car;

import CollectionFramework.*;

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
        System.out.println(tcsEmp.Name + " works in "+ tcsEmp.orgName + ". His employee id is "+ 
                            tcsEmp.genrateEmployeeId());

        InfosysEmployee infiEmp = new InfosysEmployee();
        infiEmp.setName("Druvh Rathi");
        System.out.println(infiEmp.Name + " works in " + infiEmp.orgName + ". His employee id is " + 
                            infiEmp.genrateEmployeeId());



        // Collection Frame work

        // 1. Array List

        LearnArrayList list = new LearnArrayList();

        List<String> orgNames = new ArrayList<>();

        // add() function

        orgNames.add("TCS");
        orgNames.add("Infosys");
        orgNames.add("HCL");

        orgNames.add(1, "Wipro");

        list.setNames(orgNames);

        System.out.println(list.getNames());


        // addAll() function

        List<Integer> lis1 = new ArrayList<>();

        lis1.add(1);
        lis1.add(2);
        lis1.add(3);
        lis1.add(4);

        List<Integer> lis2 = new ArrayList<>();
        lis2.addAll(lis1);
        lis2.add(5);

        list.setNum(lis2);

        System.out.println(list.getNum());


        // remove() function

        list.getNames().remove(0);
        System.out.println(list.getNames());

        list.getNum().remove(Integer.valueOf(3));
        System.out.println(list.getNum());

        // set()

        list.getNum().set(2, 8);
        System.out.println(list.getNum());


        // contains()

        System.out.println(list.getNum().contains(4));
        System.out.println(list.getNum().contains(8));


        // for each loop

        for (String st : list.getNames()) {
            System.out.println(st);
        }



        // 2. Stack

        LearnStack animalObj = new LearnStack();

        Stack<String> animalsStack = new Stack<>();

        // Push()
        animalsStack.push("Dog");
        animalsStack.push("Lion");
        animalsStack.push("Cow");
        animalsStack.push("Monkey");
        animalsStack.push("Cat");

        animalObj.setAnimals(animalsStack);

        System.out.println(animalObj.getAnimals());

        // peek()
        System.out.println(animalObj.getAnimals().peek());

        //pop()
        animalObj.getAnimals().pop();
        System.out.println(animalObj.getAnimals());




       


        
    }
}