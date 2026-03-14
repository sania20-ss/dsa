import java.util.*;
import java.lang.*;
import java.io.*;

public class Average
{
    public  static double Average(int[] arr){
        // int  sum = 0 ;
        // int  average = 0 ; 
        // for(int i = 0 ; i < arr.length ; i++){
        //     sum += arr[i];
        //     average = sum/arr.length;
        // }
        // return average; 
        int sum = Arrays.stream(arr).sum();
        double average =  sum /(double) arr.length ;
        return average;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner  sc =  new Scanner(System.in);
		int  size =  sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i < size ;  i++){
		    arr[i] =  sc.nextInt();
		}
        System.out.println(Average(arr));
	}
}

// typecasting  rules 

// Conversion follows the order byte → short → int → long → float → double.

// Converting smaller type → larger type is automatic and safe.// No explicit cast needed.

// Converting larger type → smaller type requires manual casting.

// You can only cast between numeric compatible types


// Upward → automatic
// Downward → explicit casting required.