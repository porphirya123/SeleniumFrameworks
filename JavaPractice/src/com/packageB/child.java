package com.packageB;

import com.packageA.Human;

public class child extends Human{
	
	
	
	

	public static void main(String[] args) {

		child obj = new child();
		System.out.println(obj.getName());
		obj.setAge(34);
		System.out.println(obj.getsalary());
		System.out.println(obj.getAge());
	
	
	}

}

