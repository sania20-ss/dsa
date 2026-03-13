import java.util.*;

public class SumSubArray{

    public static void SumSub(int num[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
       
       for(int i= 0; i<num.length; i++ ){
        int start = i;
        for(int j = i+1; j<num.length; j++){
            int end = j;
            currSum = 0;
            for(int k = start ; k <= end ; k++){
                currSum += num[k];
            }
            System.out.println(currSum);
            if(maxSum < currSum){
                maxSum = currSum;
            }
            
        }
     
       }
       System.out.println( "max sum is :"+ maxSum);
    }


    public static void main(String[] args){
       int num[] = {2,4,6,8,10};
       SumSub(num);
    }
}