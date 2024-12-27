package OOPs.encapsulation;

public class Employee {
	
	
	
	public static void main(String[] args) {
		
		Bank sbi = new Bank();
		System.out.println(sbi.getAccNum());
		System.out.println(sbi.salary());
		sbi.setAtmPin(4444);
		
	}

}
