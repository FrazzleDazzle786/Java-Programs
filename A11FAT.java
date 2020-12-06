/*********************************
Programmers: Fraz Tariq
Date: October 27th, 2017
Output: Array List Exercise
**********************************/
import java.util.Scanner; // import Java package
import java.text.DecimalFormat; // Java Package
import java.util.ArrayList; //arraylist package
public class A11FAT
{

        public static void main(String[] args)
          {
			  Scanner keyboard = new Scanner(System.in);
			  char select;
			  String l;
			  int i, size, k;
			  ArrayList<String> nameList2 = new ArrayList<String>(10);
			  nameList2.add("757-888-8888");
			  nameList2.add("757-999-9999");
			  nameList2.add("757-111-1111");
			  nameList2.add("757-222-2222");
			  nameList2.add("757-333-3333");
			  nameList2.add("757-444-4444");
			  nameList2.add("757-555-5555");
			  nameList2.add("757-666-6666");
			  nameList2.add("757-777-7777");
			  nameList2.add("804-221-2121");

			  ArrayList<String> nameList = new ArrayList<String>();
			  nameList.add("Andrew Jung ");
			  nameList.add("Michael Summers");
			  nameList.add("Whitney Wright");
			  nameList.add("Alexander Jones");
			  nameList.add("Robert Newmaster");
			  nameList.add("Chris Jester");
			  nameList.add("Heather Garn");
			  nameList.add("Jared Cook");
			  nameList.add("Gregry Umfleet");
			  nameList.add("Nicholas");
			  size = nameList.size();
			  //System.out.println("List" + (i+1) + ":");





		      for(i = 0; i < size; i++)
		      {
				  System.out.println("List " + (i+1) + ":");
				  System.out.println("Name: " + nameList.get(i) + "\t \t Phone Number: " + nameList2.get(i));
				  System.out.println(" ");
			  }

				  System.out.print("Would you like to remove a item from the array? (y/n): ");
			      l = keyboard.nextLine();
			      select = l.charAt(0);

			      if (select == 'y' || select == 'Y')
			      {
					  do
					  {
						  System.out.println("Enter a the number of the list you'd like to remove!");
						  k = keyboard.nextInt();
						  nameList.remove(k-1);
						  nameList2.remove(k-1);
						  size = nameList.size();
						  keyboard.nextLine();
				          System.out.print("Would you like to remove a item from the array? (y/n): ");
			              l = keyboard.nextLine();
			              select = l.charAt(0);

					  }
					  while(select == 'y' || select == 'Y');

				  }

				  else if (select == 'n' || select == 'N')
				  {
					  System.out.println("Thank you for using the Array list program");
				  }

		      for(i = 0; i < size; i++)
		      {
				  System.out.println("List " + (i+1) + ":");
				  System.out.println("Name: " + nameList.get(i) + "\t \t Phone Number: " + nameList2.get(i));
				  System.out.println(" ");
			  }























          }


}