import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.sound.midi.Soundbank;

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


        // 7. LinkedHashSet - unique, and data is stored in ordered form

        LearnLinkedHashSet linkedHashSetObj = new LearnLinkedHashSet();

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Harshit");
        linkedHashSet.add("Arun");
        linkedHashSet.add("Harish");
        linkedHashSet.add("Ayush");
        linkedHashSet.add("Souvik");

        linkedHashSetObj.setNames(linkedHashSet);
        System.out.println(linkedHashSetObj.getNames());

        System.out.println(linkedHashSetObj.getNames().remove("Aman"));
        System.out.println(linkedHashSetObj.getNames().size());

        linkedHashSetObj.getNames().clear();

        System.out.println(linkedHashSetObj.getNames());


        // 8. Tree set - Unique, ordered and in sorted order

        // i General Implementation

        // Example - 1

        LearnTreeSet treeSetObj = new LearnTreeSet();

        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(55);
        treeSet.add(34);
        treeSet.add(7);
        treeSet.add(12);
        treeSet.add(2);

        treeSetObj.setRollNumber(treeSet);
        System.out.println(treeSetObj.getRollNumber());

        try {
            System.out.println(treeSetObj.getRollNumber().remove("Aman"));
        } catch (Exception e) {
            System.out.println("remove() function returns exception if it does not able to delete the data");
        }

        System.out.println(treeSetObj.getRollNumber().size());

        treeSetObj.getRollNumber().clear();

        System.out.println(treeSetObj.getRollNumber());

        // Example - 2

        TreeSet<String> treeSetStr = new TreeSet<>();

        treeSetStr.add("Harshit");
        treeSetStr.add("Ayush");
        treeSetStr.add("Kuljeet");
        treeSetStr.add("Souvik");
        treeSetStr.add("Rishi");

        treeSetObj.setFriendsName(treeSetStr);

        System.out.println(treeSetObj.getFriendsName());



        // ii Creating tree set for non-primitive datatype

        System.out.println("Tree set with non primitive datatype");

        LearnTreeSetNonPrimitiveDataType studentObj = new LearnTreeSetNonPrimitiveDataType();

        studentObj.setName("Harshit Gupta");
        studentObj.setRollNum(44);

        TreeSet<LearnTreeSetNonPrimitiveDataType> student = new TreeSet<>();

        student.add(studentObj);
        student.add(new LearnTreeSetNonPrimitiveDataType("Ayush Joshi", 34));
        student.add(new LearnTreeSetNonPrimitiveDataType("Kuljeet Kaur", 54));
        student.add(new LearnTreeSetNonPrimitiveDataType("Random Guy", 90));

        // This will not add, compareTo() will not add this object because it has the rollNumber same as above.
        student.add(new LearnTreeSetNonPrimitiveDataType("Random Guy", 90));

        System.out.println(student);


        // 9. HashMap

        LearnMap mapObj = new LearnMap();

        Map<String, Integer> map = new HashMap<>();

        map.put("One", 1);
        map.put("Two", 2);
        map.put("Five", 5);
        map.put("Three", 3);

        mapObj.setNumber(map);

        System.out.println(mapObj.getNumber());

        // Iterate on MAP

        for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for(String k : map.keySet()){
            System.out.println(k);
        }

        for(Integer v : map.values()){
            System.out.println(v);
        }

        System.out.println(mapObj.getNumber().containsKey("Two"));
        System.out.println(mapObj.getNumber().containsValue(2));
        System.out.println(mapObj.getNumber().isEmpty());



        // 10. Tree map

        // Example - 1

        LearnTreeMap treeMapObj = new LearnTreeMap();

        Map<String, Integer> numberMap = new TreeMap<>();

        numberMap.put("One", 1);
        numberMap.put("Two", 2);
        numberMap.put("Three", 3);
        numberMap.put("Four", 4);

        treeMapObj.setNumberSeries(numberMap);

        System.out.println(treeMapObj.getNumberSeries());

        treeMapObj.getNumberSeries().remove("One");

        System.out.println(treeMapObj.getNumberSeries());

        // All functions wich works in Hash map will also work in Tree Map

        // 11. Array class

        LearnArrayClass arrayClassObj = new LearnArrayClass();

        int[] arr = {2, 4, 5,64,7,8,4,254,6};

        Arrays.sort(arr);

        arrayClassObj.setNumbers(arr);

        for (int i: arrayClassObj.getNumbers()) {
            System.out.println(i);
        }

        System.out.println(Arrays.binarySearch(arr, 254));
        Arrays.fill(arrayClassObj.getNumbers(), 12);
        
        for (int i: arrayClassObj.getNumbers()) {
            System.out.println(i);
        }


        // 11 Collection class

        LearnCollectionsClass collClassObj = new LearnCollectionsClass();

        ArrayList<Integer> arrList = new ArrayList<>();

        arrList.add(2);
        arrList.add(11);
        arrList.add(3);
        arrList.add(2);
        arrList.add(12);

        collClassObj.setNum(arrList);

        System.out.println(Collections.min(collClassObj.getNum()));
        System.out.println(Collections.max(collClassObj.getNum()));
        System.out.println(Collections.frequency(collClassObj.getNum(), 12 ) );



        // Comparable concept

        List<LearnComparable> students = new ArrayList<>();

        students.add(new LearnComparable("Harashit", 44));
        students.add(new LearnComparable("Ayush", 34));
        students.add(new LearnComparable("Kuljeet", 54));
        students.add(new LearnComparable("Souvik", 3));
        students.add(new LearnComparable("Ayush k", 55));

        Collections.sort(students, new Comparator<LearnComparable>() {

            @Override
            public int compare(LearnComparable o1, LearnComparable o2){
                return o1.name.compareTo(o2.name);
            }
        });

        System.out.println(students);


        // Stream Api functions and use.

        LearnArrayList arrLisObj = new LearnArrayList();

        List<Integer> lis = new ArrayList<>();

        lis.add(1);
        lis.add(3);
        lis.add(76);
        lis.add(55);
        lis.add(12);
        lis.add(14);
        lis.add(2);

        List<Integer> sortedLis = lis.stream()
                                        .filter(n -> n%2==0)
                                        .map(n -> n*2)
                                        .sorted(Comparator.reverseOrder())
                                        .collect(Collectors.toList());

        Long arrSize = sortedLis.stream().count();

        arrLisObj.setNum(sortedLis);
        arrLisObj.setArraySize(arrSize);

        System.out.println(arrLisObj.getNum());
        System.out.println(arrLisObj.getArraySize());

    }
}