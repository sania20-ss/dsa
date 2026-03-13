import java.util.*;

public class Reverse {
    public  static  void  reverse(int[] arr,int size){

        int  start = 0 ;
        int  end = size-1; 

        while(start<end){
            int  temp =  arr[start];
            arr[start]=   arr[end];
            arr[end] =  temp;
            end = start ;
            start ++; 
            end --;

        }

        for(int i = 0 ;  i < size ;  i++){
            System.out.print(arr[i] +" ");
        }
        // for(int j= size -1;  j >= 0 ;j-- ){
        //     System.out.print(arr[j]+" ");
        // }
    }
    public static void  main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the  size of  array ");
        int size =  sc.nextInt();
        int[] arr  =  new int[size];
        System.out.println("Enter the arrray with  [] or {}");
        for(int i = 0 ;  i < size ; i++){
            arr[i] =  sc.nextInt();
        }
        reverse(arr,size);
    } 
}