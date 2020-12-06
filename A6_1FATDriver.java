/*********************************
programmers: Fraz Tariq
Date: October 6th, 2017
Output: Activity 6-1
**********************************/
import java.util.Scanner; // import Java package
import java.text.DecimalFormat; // Java Package
import java.util.Random;  //package for random class
public class A6_1FATDriver //class name
{
	private double kilogram;
	private double pounds;


        public double setKilogram()
          {
			  System.out.print("Enter Kilograms: ");
			  Scanner keyboard = new Scanner(System.in);
			  kilogram = keyboard.nextDouble();
			  return kilogram;

		  }
		public double getKilogram()
		{
			return kilogram;
		}

	    public double setConvert()
	    {
			pounds = (kilogram * 2.20462262185);
			return pounds;
		}
}