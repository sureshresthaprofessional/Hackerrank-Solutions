package HackerrankSolutions;

/*
 * Question
 * You are given an integer , you have to convert 
 * it into a string.
 * Please complete the partially completed code in the editor. 
 * If your code successfully converts  into a string  the code 
 * will print "Good job". Otherwise it will print "Wrong answer".
 * can range between  to  inclusive.
 * 
 * */



import java.util.*;
import java.security.*;
public class IntToString {
 public static void main(String[] args) {

  try {
   Scanner in = new Scanner(System.in);
   int n = in .nextInt();
   in.close();
   //String s=???; Complete this line below

   /*
    * Solution 1. String.valueOf(n);
    * Solution 2. "" + n;
    * */
   
   String s = String.valueOf(n);
   
   //Write your code here

   
   if (n == Integer.parseInt(s)) {
    System.out.println("Good job");
   } else {
    System.out.println("Wrong answer.");
   }
  } catch (DoNotTerminate.ExitTrappedException e) {
   System.out.println("Unsuccessful Termination!!");
  }
 }
}

//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

 public static class ExitTrappedException extends SecurityException {

  private static final long serialVersionUID = 1;
 }

}
