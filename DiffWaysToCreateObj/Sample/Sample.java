package DiffWaysToCreateObj.Sample;

public class Sample implements Cloneable{
    
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Sample() {
    }

    public Sample(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Sample [name=" + name + ", id=" + id + "]";
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    
}
