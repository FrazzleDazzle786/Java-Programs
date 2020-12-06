/*********************************
programmers: Fraz Tariq
Date: October 5th, 2017
Output: Activity 6
**********************************/
import java.util.Scanner; // import Java package
import java.text.DecimalFormat; // Java Package
import java.util.Random;  //package for random class
public class A6FAT //class name
{

        public static void main(String[] args) //main method
          {

			  double setRadius;
			  System.out.print("Enter Radius: ");
			  Scanner keyboard = new Scanner(System.in);
			  setRadius = keyboard.nextDouble();
			  A6FAT_Constructor Fraz = new A6FAT_Constructor(setRadius, 3.14159);

			  System.out.println("Area: " + Fraz.getArea());
			  System.out.println("Diameter: " + Fraz.getDiameter());
			  System.out.println("Circumference: " + Fraz.getCircumference());


		  }
}