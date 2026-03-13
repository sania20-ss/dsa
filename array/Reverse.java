import java.util.*;

public class Reverse{
    public static void reverseNumber(int num[]){
        int start = 0, last = num.length-1;
        while(start < last){
            int temp = num[last];
            num[last] = num[start];
             num[start] = temp;

            start ++;
            last--;
        }
    }

    public static void main(String args[]){
     int num[] = {12,3,4,5,7};
     reverseNumber(num);
     
     for(int i = 0 ; i<num.length; i++){
        System.out.print(num[i]+" ");
     }
     System.out.println();
    }
}