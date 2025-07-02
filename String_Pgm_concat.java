package MT55_batch;

public class String_Pgm_concat {

	public static void main(String[] args) {
	String str1=new String(" automation");
	String str2= str1.concat(" testing");
	System.out.println(str1);
	System.out.println(str2);
	String str3= "Automation";
	System.out.println(str3.concat(str2));
	System.out.println(new String("ABC"));
	StringBuffer sb= new StringBuffer("Hello");
	sb.append("Nike");
	System.out.println(sb);
	StringBuilder sbu= new StringBuilder("nikendra").append(" Sa");
	sbu.append("Sah");
	System.out.println(sbu);
	StringBuilder strbuilder= new StringBuilder("Auto");
	strbuilder.insert(4,"mation");
	System.out.println("the insertion is "+strbuilder);
	strbuilder.append(" Testing");
	System.out.println(strbuilder); // op - Automation Testing
	strbuilder.replace(0,10,"API"); 
	System.out.println(strbuilder); // API Testing
	strbuilder.delete(0, 3);// " Testing"
	System.out.println(strbuilder);//" Testing"
	
	//System.out.println(strbuilder.substring(4)); // "ting"
	//System.out.println(strbuilder.substring(3,8));//sting
	strbuilder.reverse();//gnitest
	System.out.println(strbuilder);
	}

}
