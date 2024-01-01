package CollectionFramework;

import java.util.TreeSet;

public class LearnTreeSet {
    public TreeSet<String> friendsName = new TreeSet<>();

    public TreeSet<Integer> rollNumber = new TreeSet<>();

    public TreeSet<Integer> getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(TreeSet<Integer> rollNumber) {
        this.rollNumber = rollNumber;
    }

    public TreeSet<String> getFriendsName() {
        return friendsName;
    }

    public void setFriendsName(TreeSet<String> friendsName) {
        this.friendsName = friendsName;
    }

}
