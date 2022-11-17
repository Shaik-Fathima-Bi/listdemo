package arraylist;
public class Employee{
	private String Empname;
	private int EID;
	private double sal;
	public Employee(int EID,String Empname,double sal) {
		this.EID=EID;
		this.Empname=Empname;
		this.sal=sal;
	}
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public int getEID() {
		return EID;
	}
	public void setEID(int eID) {
		EID = eID;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "Employee [Empname=" + Empname + ", EID=" + EID + ", sal=" + sal + "]";
	}	
	
	
}
