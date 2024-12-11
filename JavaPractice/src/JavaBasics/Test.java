package JavaBasics;

import java.util.Date;

public class Test {
	
	
	Date d = new Date();
	String filename = d.toString().replace(" ", "_").replace(":","_")+".jpeg";
	
	
	public static void main(String[] args) {
		Test obj = new Test();
		System.out.println(obj.filename);
	}

}
