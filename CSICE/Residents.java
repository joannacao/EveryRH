package CSICE;

public class Residents implements Socialize{
	private boolean met; 
	private String name;  
	
	public Residents(String name) {
		this.name = name; 
	}
	public void setMeet(boolean met) {
		this.met = met; 
	}
	public boolean getMeet() {
		return met; 
	}
	public String getName() {
		return name; 
	}
	public void setName(String name) {
		this.name = name; 
	}
}
