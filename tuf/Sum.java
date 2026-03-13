import java.util.*;
import java.lang.*;
import java.io.*;

public class Sum
{
    public  static  int sum(int[] arr){
        int  sum =  0 ;
        for(int i = 0 ;  i < arr.length ;  i++){
        
                sum = sum + arr[i]; 
            
        
        }
       return sum ;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner  sc = new Scanner(System.in);
	   int  size = sc.nextInt();
	   int[] arr =  new int[size];
	   for(int i = 0 ;  i < size ;  i ++){
	       arr[i] = sc.nextInt();
	   }
       System.out.print(sum(arr));
	}
}
