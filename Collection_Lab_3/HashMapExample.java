package collection.example;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> Emp=new HashMap<>();
		
		// Adding elements to the  HashMap
		
		Emp.put(101,"Vikram");
		Emp.put(102,"Vikram");
		Emp.put(103,"Shubham");
		Emp.put(104,"Yash");
		Emp.put(105,"Dhanashree");
		
		System.out.println("List of EmpId With EmpName:"+Emp);
		
		// Retrieve a value from the HashMap
        String empName = Emp.get(102);
        System.out.println("Employee Name for ID 102: " + empName);
	}

}
