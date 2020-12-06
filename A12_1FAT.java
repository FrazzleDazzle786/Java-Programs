/*********************************
Programmers: Fraz Tariq
Date: November 3th, 2017
Output: Activity 12-1
**********************************/
import java.util.Scanner; // import Java package
import java.text.DecimalFormat; // Java Package
public class A12_1FAT
{
	  public static void main(String[] args)
	  {
		  //DecimalFormat formatter = new DecimalFormat("##0.00");
		  Scanner keyboard = new Scanner(System.in);

		  int i , size;
		  double Grade, max;
		  System.out.print("How Many Grades would you like to input? --> ");
		  size = keyboard.nextInt();
		  double[] num = new double [size];
		  System.out.println("  ");

		  for(i=0; i < num.length; i++)
		  {
			 System.out.print("Enter Grade for Student " + (i+1) + ": ");
			 Grade = keyboard.nextDouble();
			 num[i] = Grade;
		  }
		  System.out.println("  ");
		  Max(num);
		  Min(num);
		  Average(num);



	  }


        public static void Max(double[] a)
        {
			double max = a[0];

         for (int i = 1; i < a.length; i++)
         {
            if (a[i] > max)
            {
				max = a[i];
			}
		 }
		 System.out.println("Highest Grade: " + max);
	    }

        public static void Min(double[] c)
        {
			double min = c[0];

         for (int i = 1; i < c.length; i++)
         {
            if (c[i] < min)
            {
				min = c[i];
			}
		 }
		 System.out.println("Lowest Grade: " + min);
	    }

	public static void Average(double[] b)
	{
		int i;
		double sum, avg;
		int count;			//counter variable to count the number of repetition

		//guarantee two deciaml points.
		DecimalFormat formatter = new DecimalFormat("#.00");

		//calculate math average for each class
	    sum = 0.0;
	    count = 0;
		for(i = 0; i < b.length; i++)
		{
				count++;
				sum += b[i];
	    }

			avg = sum / count;
			System.out.println("Class Average: " + formatter.format(avg));


	}


}





