package CSICE;

public class Student extends Residents{
	String broncoID;
	
	public Student(String name, String broncoID) {
		super(name); 
	}
	public void setBroncoID(String broncoID) {
		this.broncoID = broncoID; 
	}
	public String getBroncoID() {
		return broncoID; 
	}
}
