/*********************************
Programmers: Fraz Tariq
Date: September 20th, 2017
Output: Array Lab
**********************************/

public class A5FAT
{
	  public static void main(String[] args)
	  {
		  String phrase1 = "I love your dark eyes, And your curly hair,";
          String phrase2 = "I love your smile, And the way that you care.";
          String phrase3 = "I love your deep kisses, I love your soft touch,";
          String phrase4 = "I love you, I love you,";
          String phrase5 = "I love you so much.";

         System.out.println(phrase1 + "\n" + phrase2 + "\n" + phrase3 + "\n" + phrase4 + "\n" + phrase5);
         //mutations of replacing
         String mutation1 = phrase1.replace("love" , "hate");
         String mutation2 = phrase2.replace("love" , "hate");
         String mutation3 = phrase3.replace("love" , "hate");
         String mutation4 = phrase4.replace("love" , "hate");
         String mutation5 = phrase5.replace("love" , "hate");
         System.out.println("\n");

         System.out.println(mutation1 + "\n" + mutation2 + "\n" + mutation3 + "\n" + mutation4 + "\n" + mutation5);





      }
}