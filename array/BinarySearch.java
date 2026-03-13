import java.util.*;

// binary search - performed on a sorted array (mid = start+end/2 and )

public class BinarySearch{
    public static int binary(int arr[], int key){
        int start = 0 , end = arr.length-1;
   
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid]> key){
                return end= mid-1;
            }
            else 
            {return start= mid+1;}
         
        }
        return -1;
    }

    public static void main(String args[] ){
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the size of array ");
     int n = sc.nextInt();

    //  for array 
        int[] arr = new int[n];
         System.out.println("enter "+ n +" numbers");
     for(int i =0 ; i<=n; i++){
        arr[i] = sc.nextInt();
     }

    //  sorting of array for binary search 
     Arrays.sort(arr);

    //  int arr[n] = sc.nextInt();
    System.out.println("enter the key ");
    int key = sc.nextInt();
     
     System.out.println("key is present at index"+ binary(arr,key));
    }
}
