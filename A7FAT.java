/*********************************
Programmers: Fraz Tariq
Date: October 12th, 2017
Output: Math Activity
**********************************/
import java.util.Scanner; // import Java package
import java.text.DecimalFormat; // Java Package
public class A7FAT
{

        public static void main(String[] args)
          {
			 int input;//variable
			 double a = 0, b = 0; //parameter/argument variables
			 System.out.println("Welcome to Geometric Calculator!");
			 System.out.println("1. Calculate The Circle Area");
			 System.out.println("2. Calculate The Rectangle Area");
			 System.out.println("3. Calculate The Triangle Area");
			 System.out.println("4. To QUIT");
			 System.out.println("Enter your choice (1-4)");
			 //user makes descision

			 Scanner keyboard = new Scanner(System.in); //system input
			 input = keyboard.nextInt();



			 if (input == 1)
			 {
				 Circle(a);
			 }
			 else if (input == 2)
			 {
		        Rectangle(a, b);

			 }
			 else if (input == 3)
			 {
		        triangle(a, b);
			 }
             //method calls
			 else if (input == 4)
			 {
				 //if user shooses 4 they can quit
			 	System.out.println("you have chosen to quit the program, Thank You and have an Awesome Day!!!");
			 }

			 else
			 {
				 System.out.println("you have chosen an invalid choice! Please reboot the program!");
			 }



          }

        public static void Circle(double a)
        {

            System.out.println("you have chosen Circle Area Calculator");
            do {

            Scanner keyboard = new Scanner(System.in);
			System.out.print("Enter the Radius: ");
			a = keyboard.nextDouble();

			if (a > 0)
            {
				double area = (Math.PI * a * a);
			    System.out.println("The area of the circle is " + area);
			}
			else
			{
				System.out.println("Invalid choice, Integer must be Positive!");
			}
			}while(a < 0);
			//denies negative input
		}
        //circle method
		public static void Rectangle(double a, double b)//parameters
		{

			Scanner keyboard = new Scanner(System.in);
			System.out.println("you have chosen The Rectangle Area Calculator");
			System.out.print("Enter the Base: ");
			a = keyboard.nextDouble();
			System.out.print("Enter the Width: ");
			b = keyboard.nextDouble();

		    double area = (a * b);
			System.out.println("The area of the Rectangle is " + area);
           // Rectangle method
		}

		public static void triangle(double a, double b) //parameters
	    {
			Scanner keyboard = new Scanner(System.in);
            System.out.println("you have chosen Triangle Area Calculator");
			System.out.print("Enter the width: ");
			a = keyboard.nextDouble();
			System.out.print("Enter the length: ");
			b = keyboard.nextDouble();
		    double area = (a * b * 0.5);
			System.out.println("The area of the Triangle is " + area);
			 // Triangle method
	    }
}