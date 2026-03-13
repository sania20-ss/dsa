import java.util.*;
import java.lang.*;
import java.io.*;

public class FrequencyCount
{
    public static  void  frequencyCount(int[] arr , int size){
       
       boolean[] visited = new boolean[size];
        for(int i = 0 ;  i < size ; i++){
               if (visited[i])
                   continue;
             int  count =  1 ;
            for (int j = i+1 ; j < size ; j++){
                if (arr[i] == arr[j]){
                    visited[j] = true ;
                    count++;
                }
              
            }
          System.out.println("the  frequency  count  of " + arr[i] +" is " + count  );
        }
    } 
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner  sc =  new Scanner(System.in);
        int  size =  sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ;  i< size ;  i ++){
            arr[i] =  sc.nextInt();
        }
        frequencyCount(arr,size);
        
	}
}
