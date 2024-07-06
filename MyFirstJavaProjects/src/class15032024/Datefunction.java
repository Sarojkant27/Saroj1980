package class15032024;

import java.util.*;

public class Datefunction {

	public static void main(String[] args) 
	{
		Date d1=new Date();
		System.out.println(d1.getTime()); //machine time
		Date d2=new Date(d1.getTime());//human time
		System.out.println(d2);
		String current_time= d2.toString();
		System.out.println(current_time);
		Date future_time=new Date(d1.getTime()-(1000*60*60*24*10));
		System.out.println(future_time);
		String month=current_time.substring(4, 7);
		System.out.println(month);
		
		
		
		
		
		

	}

}
