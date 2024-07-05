package collection.example;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

    TreeMap<Integer,String> Emp=new TreeMap<>();
		
		Emp.put(101,"Vikram");
		Emp.put(102,"");
		Emp.put(103,"Shubham");
		Emp.put(104,"Yash");
		Emp.put(105,"Dhanashree");
		
		System.out.println(Emp);
		
		Map<Integer,String> moreEmp=new TreeMap<>();
		
		moreEmp.put(106,"Vishal");
		moreEmp.put(107,"Raj");
		moreEmp.put(108,"Vishnu");
		
		Emp.putAll(moreEmp);
		
		System.out.println(Emp);
		
		Emp.clear();
		System.out.println(Emp);
		
        System.out.println(Emp.isEmpty());
		
		Emp.put(109,"Rajesh");
		System.out.println(Emp.isEmpty());
	
	}
}
