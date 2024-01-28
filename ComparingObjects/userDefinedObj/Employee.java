package ComparingObjects.userDefinedObj;

public class Employee {
    
    private String name;
    private String email;
    private Long phone;
    
    public Employee(String name, String email, Long phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    public Employee() {
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((phone == null) ? 0 : phone.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Employee other = (Employee) obj;

        long phone1 = this.phone;
        long phone2 = other.phone;

        System.out.println(phone1);
        System.out.println(phone2);

        if (phone1 == phone2) {
            return true;
        } else {
            return false;
        }
    }

    
}
