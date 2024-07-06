package Assignment;

import java.util.Date;

public class Findoutthefuturetimein10days {

	public static void main(String[] args) {
	Date d	= new Date();
	Date future_time=new Date(d.getTime()-(1000*60*60*24*10));
	System.out.println(future_time);
   
	}

}
