package CollectionFramework;

public class LearnTreeSetNonPrimitiveDataType implements Comparable<LearnTreeSetNonPrimitiveDataType> {
    public String name;
    public int rollNum;

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNum=" + rollNum + "]";
    }

    public LearnTreeSetNonPrimitiveDataType() {
    }
    
    public LearnTreeSetNonPrimitiveDataType(String name, int rollNum) {
        this.name = name;
        this.rollNum = rollNum;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollNum() {
        return rollNum;
    }
    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    @Override
    public int compareTo(LearnTreeSetNonPrimitiveDataType o) {
        
        if (rollNum != o.getRollNum()){
            return 1;
        }else{
            return 0;
        }
    }
}
