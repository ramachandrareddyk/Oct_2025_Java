package Abstraction;

public class Honda extends Bike{

	@Override
	public void run() {
	System.out.println("Running safely");
		
	}

	@Override
	public void start() {
		System.out.println("Start with push button");
		
	}

	@Override
	public void stop() {
		System.out.println("Stop with key");
		
	}
	
	public void fuelType() {
		System.out.println("Honda runs with petrol");
	}

}
