import java.util.*;

public class PairSum2{
     
     public  static  boolean targetSum(ArrayList<Integer> list , int target){
        
        return false ;
     }

    // ques  for the  sorted  and  rotated  arraylist
    public static void main(String[] args) {
        ArrayList<Integer> list =  new  ArrayList<>();
        // 11,15,6,8,9,10  target = 16
        list.add(11);        
        list.add(15);        
        list.add(6);        
        list.add(8);        
        list.add(9);        
        list.add(10);     

        int  target =  16;
        System.out.println(targetSum(list, target));   
    }
}  