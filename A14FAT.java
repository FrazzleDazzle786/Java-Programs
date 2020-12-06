/*********************************
Programmers: Fraz Tariq
Date: September 18th, 2017
Output: Array Exercise
**********************************/
import java.util.Scanner; // import Java package
public class A14FAT
{
	  public static void main(String[] args)
	  {
		  int i , j;
		  int insert;
		  int[][] hello = new int [2][3];
		  Scanner keyboard = new Scanner(System.in);

		  for(i=0; i < hello.length; i++)
		  {
			  for(j = 0; j < hello[i].length; j++)
			  {
				  System.out.print(" ");
				  insert = keyboard.nextInt();
				  hello[i][j] = insert;
			  }
		  }




      }
}