package EncapsulationConscept;

public class Browser {
	
	
	public void launchBrowser() {
		System.out.println("Launching browser");
		
		checkBrowserPolicy();
		checkBrowserUpadtes();
		checkRAMSize();
		verifyStorage();
		
		System.out.println("Chrome is launched");
		
	}
	
	
	
	
	private void checkBrowserUpadtes() {
		System.out.println("check browser updates");
	}
	private void checkRAMSize() {
		System.out.println("Check RAM Size");
	}
	
	private void verifyStorage(){
	System.out.println("Verify storage");
	}
	
	private void checkBrowserPolicy() {
		System.out.println("Check Browser policy");
	}

}
