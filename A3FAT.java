/*********************************
Programmers: Fraz Tariq
Date: September 13th, 2017
Output: Activity 3
**********************************/
import java.util.Scanner; // import Java package
public class A3FAT
{

        public static void main(String[] args)
          {
			int i, sum = 0; // int variables
			int value = 0; // value variable
			int[] even = new int[11];

		    System.out.println("All even numbers from 1-20 in an array!");
			System.out.println("--------------------------------------");
			System.out.println("Element #           Value");



			    for(i = 0; i < even.length; i++) // for loop to assign values that are even into an array
			        {

					  System.out.print(i); // prints the increments of 1 to show what value you're on
			   		  even[i] += value; // adds counter value to array value
					  System.out.println("                   " + even[i]); //displays array you're on
					  value += 2; // value increases


					}

				for (i = 0; i < even.length; i++) // for loop to add all the arrays to bring 110 value
					{
					  sum += even[i]; //adds arrays to sum 11 times
					}
					System.out.println("The sum of the even numbers from 1-20: " + sum); //displays the total of all array values!
			        System.out.println(" ");
          }
}