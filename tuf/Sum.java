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

//  ypu can  also  use  
//  Arrays.stream(arr).sum();
// this is  used  to  convert the  array  intov  stream  for  ex :  for [0,1,2] 0 -> 1 -> 2 and  then  .sum()  function  will add that  to  0+1+2 = 3 