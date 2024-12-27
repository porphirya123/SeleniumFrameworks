package JavaPractice;

public class MathTricQuestions {
	
	public void revNum(int num)
	{
		int revnum=0;
		
		while(num!=0)
		{
			int temp = num%10;
			revnum = revnum*10+temp;
			num = num/10;
			
			
		}
		System.out.println(revnum);

	}
	
	
	public void findFibonachi(int num)
	{
		
		int fnum= 0;
		int snum = 1;
		int count = 2;
		
		while(count<=num)
		{
			
			int temp = snum;
			snum = snum+fnum;
			fnum = temp;
			count++;
		}System.out.println(snum);
				
	}
	
	
	
	public static void main(String[] args) {
		
		MathTricQuestions obj = new MathTricQuestions();
		obj.revNum(12345);
		obj.findFibonachi(8);
		
	}
	
	
	

}
