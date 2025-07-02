/*Program to demonstrate
the date class Method*/

package MT55_batch;

import java.util.Date;

public class DateClassProgram {

	public static void main(String[] args) {
Date ref= new Date();
System.out.println(ref.getTime());//it returns the current date time in long
//Date ref2= new Date(ref.getTime());
//System.out.println("the current time and date is "+ref2);
String dateCurr=ref.toString();
System.out.println(dateCurr);
String day=dateCurr.substring(0,3);
System.out.println(day);
String month=dateCurr.substring(4, 8);
System.out.println(month);
String date= dateCurr.substring(8,10);
System.out.println(date);
String year=dateCurr.substring(dateCurr.length()-4);
System.out.println(year);
String format1 = date.concat(" - ").concat(day).concat(" - ").concat(month).concat(" - ").concat(year);
System.out.println(format1);


	}

}
