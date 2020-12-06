/*********************************
Programmers: Fraz Tariq
Date: September 22nd, 2017
Output: 2D Array Exercise that calculates grades
**********************************/
import java.util.Scanner; // import Java package
import java.text.DecimalFormat; // Java Package
public class A4FAT
{
	  public static void main(String[] args)
	  {
		  int i, j; // variables
		  double sum = 0, sum2 = 0; // variables
		  double average; // Average variable
	  	  //double [][] hello = {{100, 75.0, 82.3, 35.9, 73.6, 88.9, 46.2, 100, 97.8},{25.5, 92.5, 65.5, 79.6, 22.7, 66.2, 98.7, 62.3, 100, 99.5}}; // failed attempt to declare this way
	  	  double[][] hello = new double [2][10]; // array dimensions (2 rows, 10 columns)
	  	  DecimalFormat formatter = new DecimalFormat("##0.00"); // decimal formatter declaration
	  	  // array values pre declared
		  //first set is Math grades (10)
		  hello[0][0] = 80.5;
		  hello[0][1] = 100;
		  hello[0][2] = 75.0;
		  hello[0][3] = 82.3;
		  hello[0][4] = 35.9;
		  hello[0][5] = 73.6;
		  hello[0][6] = 88.9;
		  hello[0][7] = 46.2;
		  hello[0][8] = 100;
		  hello[0][9] = 97.8;
		  //second set which is Science grades (10)
		  hello[1][0] = 25.5;
		  hello[1][1] = 92.5;
		  hello[1][2] = 65.5;
		  hello[1][3] = 79.6;
		  hello[1][4] = 22.7;
		  hello[1][5] = 66.2;
		  hello[1][6] = 98.7;
		  hello[1][7] = 62.3;
		  hello[1][8] = 100;
		  hello[1][9] = 99.5;
	      // nested for loop to get sum of all 20 values to use later for class average
		  for(i = 0; i < hello.length; i++)
		  	  {
		  	     for(j = 0; j < hello[i].length; j++)
	                 {
                      sum += hello[i][j] ;
		             }
		  	  }
		  //sum is now defined
		  average = (sum / 20); //used to find the average of 20 grades
		  System.out.println("Class Average: " + formatter.format(average)); // displays average

	      // nested for loop to obtain values of rows
		  for(i = 0; i < hello.length; i++)
		  	  {
		  		 sum2 = 0;
		  		 for(j = 0; j < hello[i].length; j++)
		  			 {
		  				sum2 += hello[i][j];
		  			 }
		         if (i == 1) // if values are in the 2nd row then those are Science grade values
		  	         {
		  		        System.out.println("Science Average: " + formatter.format(sum2/10)); //displays Science average
		  	         }
		         else if (i == 0) // else if values are in the 1st row then they are Math grade values
		  	         {
		  		        System.out.println("Math Average: " + formatter.format(sum2/10)); // displays Math average
		  	         }

		  	  }
		 System.out.println(" ");




      }
}