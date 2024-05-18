import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MyClass {
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();  // taking user input
      int arr[] = new int[size]; // Array initialize with size
      
      // To take user input elements in an array
      for(int i=0;i<size;i++){
          arr[i] = in.nextInt();
      }
      
      // To calculate sum of all elements in an array
      int sum=0;
      for(int i=0;i<size;i++){
          sum+=arr[i];
      }
       System.out.println(sum);

    }
    
}
