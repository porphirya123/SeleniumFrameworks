package Week3;

import java.util.Arrays;

public class PlayWithString {
	
	String name;
	public static String city= "Greater Noida";
	public static String[] states = city.split(" ");
	int year = 2025;
			
	public void changeCityName()
	{
		this.city = "Delhi";
		System.out.println(city);
	}
	
	public void changeYear(int year)
	{
		this.year = year;
		System.out.println(year);
	}
	
	
	public static void main(String[] args) {
		PlayWithString p = new PlayWithString();
		p.changeCityName();
		PlayWithString s = new PlayWithString();
		System.out.println(s.city);
		p.changeYear(2024);
		s.changeYear(2023);
		PlayWithString test = new PlayWithString();
		System.out.println(test.year);
		System.out.println(Arrays.toString(states));
	}
	
	

}
