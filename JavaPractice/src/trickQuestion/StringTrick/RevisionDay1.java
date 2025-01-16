package trickQuestion.StringTrick;

public class RevisionDay1 {
	
	public void revText(String text)
	{
		for(int i=text.length()-1;i>=0;i--)
		{
			char ch = text.charAt(i);
			System.out.print(ch);
		}
	}
	
	
	public void revSen(String sen)
	{
		String[] revSen = sen.split(" ");
		System.out.println();
		for(int i=revSen.length-1;i>=0;i--)
		{
			
			System.out.print(revSen[i]+ " ");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		RevisionDay1 obj = new RevisionDay1();
		obj.revText("I love Java");
		obj.revSen("I like Java");
		
	}

}
