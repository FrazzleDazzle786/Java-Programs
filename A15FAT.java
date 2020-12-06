/*********************************
Programmers: Fraz Tariq
Date: November 17th, 2017
Output: Array Exercise
**********************************/
import java.util.Scanner; // import Java package
public class A15FAT
{
	  public static void main(String[] args)
	  {
		  int i;
		  int[] hello = {90, 75, 77, 92, 100, 88, 65};

		  try
		  {
			  for(i= hello.length - 1; i >= 0; i--)
			  {
				  System.out.print("The value of the Array is:  ");
				  System.out.println(hello[i]);
			  }
		  }

		  catch(ArrayIndexOutOfBoundsException e)
		  {
			  e.printStackTrace();
		  }

      }
}