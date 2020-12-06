/*********************************
programmers: Fraz Tariq
Date: October 5th, 2017
Output: Activity 6
**********************************/
import java.util.Scanner; // import Java package
import java.text.DecimalFormat; // Java Package
import java.util.Random;  //package for random class

public class A6FAT_Constructor //class name
{
	private double radius;
	private double pi;
	private double Area;

        public A6FAT_Constructor(double i, double j) // constructor
          {
			  radius = i;
			  pi = j;

		  }

	    public double getArea()
	    {
			return (pi * radius * radius);

		}

		public double getDiameter()
		{
			return radius * 2;
		}

		public double getCircumference()
	    {
			return (2 * pi * radius);

		}
}