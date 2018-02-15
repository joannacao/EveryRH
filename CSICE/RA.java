package CSICE;

public class RA extends Residents{
	private boolean keyAccess; 
	private String broncoID; 
	
	public RA(String name, String broncoID, boolean keyAccess) {
		super(name);
		this.broncoID = broncoID;
		this.keyAccess = keyAccess; 
	}
	public void setBroncoID(String broncoID) {
		this.broncoID = broncoID; 
	}
	public String getBroncoID() {
		return broncoID; 
	}
	public void setKeyAccess(boolean keyAccess) {
		this.keyAccess = keyAccess; 
	}
	public boolean getKeyAccess() {
		return keyAccess; 
	}
}
