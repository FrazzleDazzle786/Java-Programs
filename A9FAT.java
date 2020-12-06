/*********************************
Programmers: Fraz Tariq
Date: October 20th, 2017
Output: Array Argument Activity
**********************************/
import java.util.Scanner; // import Java package
import java.text.DecimalFormat; // Java Package
public class A9FAT
{

        public static void main(String[] args)
          {
			 int size;
			 System.out.print("How Many items do you have: ");
			 Scanner keyboard = new Scanner(System.in); //system input
			 size = keyboard.nextInt();
			 double[] numbers = new double[size];
			 methodInput(numbers);
			 methodOutput(numbers);



          }

        public static void methodInput(double[] num)
        {
			 Scanner keyboard = new Scanner(System.in);
			 int i;
			 double value;

		     for(i = 0; i < num.length; i++)
		     {
				 System.out.print("Enter price of item " + (i + 1) + ": $");
				 value = keyboard.nextDouble();
		         num[i] = value;
			 }

		}
		public static void methodOutput(double[] num)
			{
				DecimalFormat formatter = new DecimalFormat("##0.00");
				int i;
				double sales;
				for(i = 0; i < num.length; i++)
				{
				System.out.print("Sales price of item " + (i + 1) + " including tax: ");
				sales = num[i] + (num[i] * 0.05);
				System.out.println("$" + formatter.format(sales));
			     }
			}



}