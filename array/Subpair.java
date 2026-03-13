import java.util.*;

public class Subpair{
    public static void pairs(int num[]){
      int total = 0;
      for(int i = 0 ; i <num.length ; i++){
        int start = i;
        for(int j = i ; j<num.length; j++){
         int end = j;
            for(int k=start; k<=end; k++){
                System.out.print(num[k]+" ");
            }
            total++;
            System.out.println();
        }
        System.out.println();
      }
       System.out.println("total "+ total);
    }
    public static void main(String[] args){
    int num[] = {2,3,4,6,5,7};    
    pairs(num);
    }
}