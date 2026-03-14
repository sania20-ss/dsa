import java.util.*;
import java.lang.*;
import java.io.*;

public class Median
{
    public static double Median(int[] arr,int size){
        Arrays.sort(arr);
        
            if (size % 2 == 0 ){
               return (double) (arr[size/2 -1] + arr[size /2])/2 ;
            }
            else {
                return arr[size/2];
            }
        
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner  sc =  new  Scanner(System.in);
	   int  size = sc.nextInt();
	   int[] arr = new int[size];
	   for(int i = 0; i < size ;  i++){
	       arr[i] =  sc.nextInt();
	   }
	   System.out.println("the median  is : "+ Median(arr,size));
	}
}
