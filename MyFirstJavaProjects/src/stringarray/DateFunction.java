package stringarray;

import java.util.Date;

public class DateFunction {

	public static void main(String[] args) 
	{
		Date d1=new Date();
		System.out.println(d1.getTime());
		d1.getDate();//Deprecated
		Date d2=new Date(d1.getTime());
		System.out.println(d2);
		String currenttime=d2.toString(); //toString is used to convert the date object to string
		System.out.println(currenttime);
		//String futuretime=d2.getTime()+(1000*60*60*24*1); 
		//System.out.println(futuretime);
		
		Date future_time=new Date(d1.getTime()+(1000*60*60*24*1)	);
		System.out.println(future_time);
		Date Past_time=new Date(d1.getTime()-(1000*60*60*24*1)	);
		System.out.println(Past_time);
		String month= currenttime.substring(4, 7);
		System.out.println(month);
		String Date=currenttime.substring(8, 10);
		System.out.println(Date);
		String Year=currenttime.substring(currenttime.length()-4);
		System.out.println(Year);
		System.out.println("The Year is " + currenttime.substring(24));
		System.out.println(month.concat(" ").concat(Date).concat(" ").concat( Year));
		System.out.println(month.concat("/").concat(Date).concat("/").concat( Year));
		System.out.println(Date.concat(" ").concat(month).concat(" ").concat( Year));
		
		
		

	}

}
