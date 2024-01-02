package CollectionFramework;

public class LearnComparable implements Comparable<LearnComparable> {
    public String name;
    public int rollNum;

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNum=" + rollNum + "]";
    }

    public LearnComparable() {
    }
    
    public LearnComparable(String name, int rollNum) {
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
    public int compareTo(LearnComparable that) {
        return this.rollNum - that.rollNum;
    }
}
