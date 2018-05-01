package com.auribises;

public class Client {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setId(102);
		emp1.setName("Jennie");
		emp1.setAge(20);
		emp1.setEmail("jennie@gmail.com");
		emp1.setAddress("Redwood");
		
		
		
		Employee emp2 = new Employee(104,"Fionna",40,"Fionna@gmail.com","Southern Street");
		
		System.out.println(emp1);
		
		JDBCHelper hepler = new JDBCHelper();       //Driver is loaded
		
		hepler.openConnection();
		
		hepler.insertEmployee(emp1);
		hepler.insertEmployee(emp2);
		hepler.closeConnection();

	}
}
