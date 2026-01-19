package EncapsulationConscept;

public class Employee {
	
	//it is the process of wrapping the data and methods togather in to a single unit
	
	private String name;
	private int age;
	private double salary;
	private boolean isPerm;
	
	public Employee(String name, int age, double salary, boolean isPerm) {
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.isPerm=isPerm;
	}
	
	
	//public methods:getters/setters
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isPerm() {
		return isPerm;
	}
	public void setPerm(boolean isPerm) {
		this.isPerm = isPerm;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	

}
