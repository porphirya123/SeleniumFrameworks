package JavaOOPs;

public class Encapsulation {
	
	
	private int rollno = 233;
	private String branch = "HR";
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}

	

}


class B
{
	
	
public static void main(String[] args) {
	
	Encapsulation obj = new Encapsulation();
	
	obj.setBranch("Admin");
	System.out.println(obj.getBranch());
	
		
	}

	
	
}




