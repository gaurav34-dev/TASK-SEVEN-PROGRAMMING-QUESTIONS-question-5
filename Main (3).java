import java.util.*;
//import java.util.Arrays;
public class Main {
public static void main(String[] args) 
{
  Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
System.out.print("Enter a string: ");  
String str= sc.nextLine();  
String str2[]=str.split(" ");
  int counter=0;
  for(int i=0;i<str2.length;i++)
    {
      System.out.println(str2[i]);
     counter++;
      
    }

System.out.println("the number of words are "+ counter);
  
 }
}