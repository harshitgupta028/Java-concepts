package DiffWaysToCreateObj;

import DiffWaysToCreateObj.Sample.Sample;

public class Clone {
    
    public static void main(String[] args) {

        Sample obj1 = new Sample();
        obj1.setName("Harshit");
        obj1.setId(44);

        try {
            Sample obj2 = (Sample) obj1.clone();
            System.out.println(obj2);

        } catch (Exception e) {
            System.out.println("Clone not supported!");
        }
        
    }
}
