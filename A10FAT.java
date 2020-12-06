/*********************************
Programmers: Fraz Tariq
Date: October 25th, 2017
Output: Ragged Array Exercise
**********************************/
import java.util.Scanner; // import Java package
import java.text.DecimalFormat; // Java Package
public class A10FAT
{

        public static void main(String[] args)
          {
			  DecimalFormat formatter = new DecimalFormat("##0.00");
			  double sum, average;
			  double counter = 0;
			  int i, j;
			  double [][] numbers = new double [5][];
			  //innitialize jagged array empty columns
			  numbers[0] = new double [10];
			  numbers[1] = new double [2];
			  numbers[2] = new double [6];
			  numbers[3] = new double [5];
			  numbers[4] = new double [2];
			  //initialize jagged array

		      numbers[0][0] = 100.0;
	       	  numbers[0][1] = 85.5;
		      numbers[0][2] = 25.4;
		      numbers[0][3] = 30.3;
	       	  numbers[0][4] = 75.5;
		      numbers[0][5] = 100.0;
		      numbers[0][6] = 88.8;
	       	  numbers[0][7] = 95.6;
		      numbers[0][8] = 97.8;
		      numbers[0][9] = 55.8;
		      //class one
		      numbers[1][0] = 50.0;
		      numbers[1][1] = 60.0;
		      //class two
		      numbers[2][0] = 70.5;
		      numbers[2][1] = 90.0;
		      numbers[2][2] = 99.9;
		      numbers[2][3] = 65.0;
		      numbers[2][4] = 44.5;
		      numbers[2][5] = 82.3;
		      //class three
		      numbers[3][0] = 39.5;
		      numbers[3][1] = 68.4;
		      numbers[3][2] = 96.9;
		      numbers[3][3] = 100.0;
		      numbers[3][4] = 28.7;
		      //class four
		      numbers[4][0] = 55.9;
		      numbers[4][1] = 100.0;
		      //class five

		      for (i = 0; i < numbers.length; i++)
		      {
				  average = 0;
				  counter = 0;
				  sum = 0;
				  //resets values after first row is complete
				  for (j = 0; j < numbers[i].length; j++)
				  {
					  sum += numbers[i][j];
					  counter++;
					  average = (sum / counter);
				  }
				  System.out.println("Average of Class " + (i+1) + " " + formatter.format(average));
				  //displays average for class i while formatting the output into decimal form
			  }
			  //loop calculates data through summing rows












          }


}