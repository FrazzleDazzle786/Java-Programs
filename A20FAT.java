/*********************************
Programmers: Fraz Tariq
Date: November 29th, 2017
Output: Activity with exceptions
**********************************/
import java.util.Scanner; // import Java package
public class A20FAT
{
	public static void main(String[] args)
	{


        double [] hello = {67, 84, 44, 88, 23, 11, -60};


		TestScores Fraz = new TestScores(hello);

		System.out.println("The Average is" + Fraz.getAverage());

	}

}