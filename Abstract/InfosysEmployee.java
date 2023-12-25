package Abstract;

public class InfosysEmployee extends abstractClass{
    public int employeeId;
    public String Name;
    public String orgName = "Infosys";

    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getOrgName() {
        return orgName;
    }
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
    @Override
    public void employeeName() {   
        
    }
}
