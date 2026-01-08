package java_Sessions;

public class Customer {
	
	
	public int getCustomerBill(String CustomerName) {
		
		if(CustomerName.equals("Mahesh")) {
			return 9000;
		}else if(CustomerName.equals("Naveen")) {
			return 15000;
		}else if(CustomerName.equals("Kumar")) {
			return 10000;
		}else {
			System.out.println("Please pass the correct customer name...."+CustomerName);
			return -1;
			
		}
		
		
	}

	public static void main(String[] args) {
		
		Customer c= new Customer();
		int bill=c.getCustomerBill("Manju");
		System.out.println(bill);

	}

}
