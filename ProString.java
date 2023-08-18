import java.io.*;
import java.util.Scanner;

class ProString
	{

	public static void main (String[] args) {
	
		String str= "Keerthana", nstr=" ";
		char ch;
	
	System.out.print("Original word is: ");
	System.out.println("Keerthana"); 
	
	for (int i=0; i<str.length(); i++)
	{
		ch= str.charAt(i); 
		nstr= ch+nstr; 
	}
	System.out.println("Reverse word is: "+ nstr);
	}
}