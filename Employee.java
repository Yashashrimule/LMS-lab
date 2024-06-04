//Create bean for Employee with fields(eid,ename,esalary).

public class Employee {
	private int eid;
	private String ename;
	private double esal;
	
	public Employee(int eid, String ename, double esal) {
        this.eid = eid;
        this.ename = ename;
        this.esal = esal;
    }

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}
	

	public static void main(String[] args) {
        // Create an Employee object
        Employee e = new Employee();

        // Set employee details using setter methods
        e.setEid(121);
        e.setEname("Yashashri Mule");
        e.setEsal(85000.90);

        // Display employee details using toString() method
        System.out.println("Employee Details:");
        System.out.println(e.toString());
    
	}
	


}