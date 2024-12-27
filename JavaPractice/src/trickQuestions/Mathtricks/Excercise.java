package trickQuestions.Mathtricks;

public class Excercise {
	
	
	public void findFibonichi(int num)
	{
		int firstindex =0;
		int nextindex = 1;
		int counter =2;
		while(counter<=num)
		{
			int temp = nextindex;
			nextindex = firstindex +nextindex;
			firstindex = temp;
			counter++;
		}System.out.println(nextindex);
		
	}
	
	public void revNum(int num)
	{
		int revnum = 0;
		while(num>0)
		{
			int temp = num%10;
			revnum = revnum*10+temp;
			num=num/10;
		}
		System.out.println(revnum);
		
		
	}
	
	public static void main(String[] args) {
	
		Excercise obj = new Excercise();
		obj.revNum(1234);
		obj.findFibonichi(6);
	}
	

}
