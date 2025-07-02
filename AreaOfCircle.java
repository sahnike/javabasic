package MT55_batch;

import java.util.Scanner;



public class AreaOfCircle {

	public static void main(String[] args) {
		final double pi=Math.PI;
	Scanner obj = new Scanner(System.in);
	System.out.println("Calculating the area of circle..");
	System.out.println("Enter the area");
	double r= obj.nextDouble();
	System.out.println("area of cirle is: "+(int)(pi*r*r));
	
	System.out.println("area of circumference is: "+(int)(2*pi*r));
	//obj.close();
	AreaOfCircle ref = new AreaOfCircle();
	ref.AreaOfRectangle();
	ref.SquareCalc();
	ref.SquareCalc();
	}

	 void AreaOfRectangle() {
		System.out.println("Finding the area of Rectange...");
		Scanner obj1= new Scanner(System.in);
		System.out.println("Please enter the Length");
		int length= obj1.nextInt();
		System.out.println("Please enter the width");
		int width= obj1.nextInt();
		System.out.println("the area of rectangle is: "+(int)(length*width));
		System.err.println("The circumference of rectangle is: "+(int)(2*(length+width)));
		//obj1.close();
	}
	
	  void SquareCalc() {
		  System.out.println("Finding the area of Square..");
		  Scanner obj2=new Scanner(System.in);
		  System.out.print("enter the Length: ");
		 int ln= obj2.nextInt();
		 System.out.println("The area of Square is: "+(int)(ln*ln));
		 System.out.println("The Circumference of Square is: "+(int)(4*ln));
		  
		  
		  }
	  void TriangleCalc() {
		  Scanner obj3=new Scanner(System.in);
		  System.out.println("Enter the base");
		  double bse= obj3.nextDouble();
		  System.out.println("Enter the height");
		  double hgt= obj3.nextDouble();
		  System.out.println("The Area of triangle is: "+(0.5*bse*hgt));
		  System.out.println("Now finding the Circumference of triangle");
		  double a=obj3.nextDouble();
		  double b=obj3.nextDouble();
		  double c=obj3.nextDouble();
		  System.out.println("The Circumference of triangle is: "+(a+b+c));

				  
	  }
	 
}
