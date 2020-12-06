/*********************************
Programmers: Fraz Tariq
Date: November 29th, 2017
Output: Activity with exceptions
**********************************/
import java.util.Scanner; // import Java package
public class A19FAT
{
	public static void main(String[] args)
	{
		Speed Fraz = new Speed();
		Scanner keyboard = new Scanner(System.in);
		String l;
		char select;
		int spe;
	    System.out.println("What would you like to do?");
	    System.out.print("'+' for increase speed, '-' for decrease speed, n for stop --> ");


		do
		{
			l = keyboard.nextLine();
			select = l.charAt(0);
			if (select == '+')
			{
				System.out.println("How much would you like to Increase?");
				spe = keyboard.nextInt();

				Fraz.speedUp(spe);
			}
			else if (select == '-')
			{
				System.out.println("How much would you like to Decrease?");
				spe = keyboard.nextInt();

				Fraz.speedDown(spe);

			}

		}
		while(select != 'n');

		System.out.println("Thank you for using this program!");







	}

}