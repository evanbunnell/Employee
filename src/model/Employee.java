/**
 * @author Evan Bunnell - ebunnell
 * CIS175 12737 - Fall 2023
 * Sep 6, 2023
 */
package model;

public class Employee {
	
	private String name;
	private double monthlySalary;
	private int age;
	
	
	//Constructors
	public Employee() {
		super();
	}
	/**
	 * @param name
	 */
	public Employee(String name) {
		super();
		this.name = name;
	}

	/**
	 * Getters
	 * @return name
	 * @return monthlySalary
	 * @return age
	 */
	public String getName() {
		return name;
	}
	
	public double getMonthlySalary() {
		return monthlySalary;
	}

	public int getAge() {
		return age;
	}
	/**
	 * Setters
	 * @param name
	 * @param monthlySalary
	 * @param age
	 */
	public void setName(String name) {
		this.name = name;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
