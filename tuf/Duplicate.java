import java.util.*;
import java.util.HashSet; 
public  class  Duplicate {
    public  static  int  duplicate(int[] arr , int  size){

        // this  function  can  work  for the  unsorted  array   and  for the  sorted  array 
       
        // HashSet<Integer> set =  new  HashSet<>();
        // int  index = 0 ;
        // for(int  x : arr){
        //     if(!set.contains(x)){
        //         set.add(x); 
        //         arr[index] =  x ;
        //         index ++;
        //     }
        // }
        // return index;
         
       
        //  this  logic  only  work  for the  sorted  array no the unsorted  once  
        // for input - 1 1 0 2 0 6  ,  o/p - 1 0 2 0 6 
         int i = 0 ;
        for(int j = 1 ;  j < size ;  j ++){
            if(arr[i] != arr[j] ){
                i++;
                arr[i] =  arr[j];
            }
            
        }
        return i + 1; 
    }
    public  static  void main(String[] args){
        Scanner  sc =  new Scanner(System.in);
        System.out.println("Enter the size of  array : ");
        int size =  sc.nextInt();
        System.out.println("Enter the  array : ");        
        int[] arr =  new int[size];
        for(int  i = 0 ;  i < size ; i++ ){
            arr[i] =  sc.nextInt();
        }
        int  dupl = duplicate(arr , size);
        for (int  i =0 ; i < dupl ;  i ++){
            System.out.print(arr[i]+" ");
        }
    }
}