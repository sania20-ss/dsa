import java.util.*;
import java.lang.*;
import java.io.*;

public class AscDsc
{
    public static void ascDscSorting(int[] arr, int  size){
        Arrays.sort(arr);
        int  midpoint =  size/2;
        int endpoint =  size-1;
         while (midpoint < endpoint){
             int  temp =  arr[midpoint];
             arr[midpoint]=  arr[endpoint];
             arr[endpoint] = temp ; 
             midpoint++;
             endpoint--;
         }
       
    }
  
	public static void main (String[] args) throws java.lang.Exception{
	    Scanner  sc =  new Scanner(System.in);
	    int  size = sc.nextInt();
	    int[]  arr =  new  int[size];
	    for(int i = 0 ;  i < size ; i++ ){
	        arr[i] = sc.nextInt();
	    }
	    ascDscSorting(arr, size);
        for(int x : arr ){
        System.out.print( x + " ");
    }
}
}