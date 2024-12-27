package OOPs.encapsulation;

public class Bank {
	
	private int accNum = 123445;
	private int salary = 30000;
	private int atmPin = 1234;
	
	
	 public void setAtmPin(int atmPin)
	 {
		 this.atmPin = atmPin;
	 }
	
	
	 public int salary()
	 {
		 return this.salary;
	 }
	 
	 public int getAccNum()
	 {
		 return this.accNum;
	 }
	 
	 
	 private int getATMPin()
	 {
		 return this.atmPin;
	 }
	 
	 
	public static void main(String[] args) {
		Bank or = new Bank();
		System.out.println(or.getAccNum());
		System.out.println(or.getATMPin());
		
	}

}
