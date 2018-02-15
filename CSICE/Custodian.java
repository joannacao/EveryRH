package CSICE;

public class Custodian extends Residents{
	private boolean keyAccess;
	
	public Custodian(String name, boolean keyAccess) {
		super(name); 
		this.keyAccess = keyAccess; 
	}
	public void setKeyAccess(boolean keyAccess) {
		this.keyAccess = keyAccess; 
	}
	public boolean getKeyAccess() {
		return keyAccess; 
	}
}
