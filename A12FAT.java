/*********************************
Programmers: Fraz Tariq
Date: November 1st, 2017
Output: IO exercise involving string methods
**********************************/
import java.io.*;
public class A12FAT
{

        public static void main(String[] args) throws IOException
          {
			  FileWriter fwriter = new FileWriter("A12FAT.txt", true);
			  PrintWriter outputFile = new PrintWriter(fwriter);

			  String phrase = "Dummy Text Output";

			  outputFile.println(phrase);
			  String mutation = phrase.replace("Text", "Program");
			  outputFile.println(mutation);




			  outputFile.close();







          }


}