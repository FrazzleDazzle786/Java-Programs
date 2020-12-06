/*********************************
Programmers: Fraz Tariq
Date: September 8th, 2017
Output: Activity to revise an exercise
**********************************/
import java.util.Scanner; // import Java package
public class A1FAT //class name
{

        public static void main(String[] args) //main method/class
          {
			  int counter, grade, total, control;
			  float average;
			  total=0;
			  counter=0;
			  control = 0;
			  grade = 0;
			  Scanner keyboard = new Scanner(System.in);
			  while (grade != -1)
			  {
				  System.out.print("Enter Grade: <-1 to end loop> " );
				  grade = keyboard.nextInt();
				  counter++;
				  total += grade;


			  }
			  average = total/counter;
			  System.out.println("The average is " + average); ;




          }
}
