package StringTrickQuestions;

public class StringPractice {
	
	String name = "I am Santosh";
	String[] revName = name.split(" ");
	public void rev()
	{
		for(int i=revName.length-1;i>=0;i--)
		{
			System.out.println(revName[i]);
		}
	}
	
	
	public static void main(String[] args) {
		StringPractice obj = new StringPractice();
		obj.rev();
	}
	

}
