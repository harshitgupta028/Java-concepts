import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
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



        // 3. Queue

        LearnLinkedListQueue locationObj = new LearnLinkedListQueue();

        Queue<String> location = new LinkedList<>();

        location.offer("Pune");
        location.offer("Mumbai");
        location.offer("Karera");
        location.offer("Jhansi");

        locationObj.setLocations(location);

        System.out.println(locationObj.getLocations());

        // poll() or remove() -> throws exception in case of no data
        System.out.println(locationObj.getLocations().poll());

        // peek()
        System.out.println(locationObj.getLocations().peek());

        // We can also implement the Queue using the list and all the function
        // of list will work on it. syntax ->  List<Integer> queue = new LinkedList<>();


        // 4. Priority queue (internally it implements min heap which result the higest priority for samll element by default)

        LearnPriorityQueue priorityQueueObj = new LearnPriorityQueue();

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(90);
        priorityQueue.offer(5);
        priorityQueue.offer(33);
        priorityQueue.offer(22);

        priorityQueueObj.setNumber(priorityQueue);

        System.out.println(priorityQueueObj.getNumber());

        System.out.println(priorityQueueObj.getNumber().poll());
        System.out.println(priorityQueueObj.getNumber());

        System.out.println(priorityQueueObj.getNumber().peek());



        // 5. Deque

        LearnArrayDeque adqObj = new LearnArrayDeque();

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        

        // offer and offerLast works as same they add element from back
        // offerFirst add element from front.

        deque.offer(12);
        deque.offer(44);
        deque.offerFirst(1);
        deque.offerLast(33);
        deque.offer(100);

        adqObj.setDisk(deque);

        System.out.println(adqObj.getDisk());

        System.out.println(adqObj.getDisk().peek());
        System.out.println(adqObj.getDisk().peekFirst());
        System.out.println(adqObj.getDisk().peekLast());

        System.out.println(adqObj.getDisk());

        System.out.println(adqObj.getDisk().poll());
        System.out.println(adqObj.getDisk().pollFirst());
        System.out.println(adqObj.getDisk().pollLast());

        System.out.println(adqObj.getDisk());

        
        
        // 6. Hash set

        LearnHashSet hashSetObj = new LearnHashSet();

        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(29);
        hashSet.add(12);
        hashSet.add(14);
        hashSet.add(8);
        hashSet.add(17);

        hashSetObj.setUniqueDates(hashSet);
        System.out.println(hashSetObj.getUniqueDates());

        System.out.println(hashSetObj.getUniqueDates().remove(29));
        System.out.println(hashSetObj.getUniqueDates().size());

        hashSetObj.getUniqueDates().clear();

        System.out.println(hashSetObj.getUniqueDates());

   
    }
}