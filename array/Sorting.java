import java.util.*;

public class Sorting {
    public static void BubbleSort(int arr[]){
        for(int turn = 0; turn < arr.length -1 ; turn++ ){
            for (int j = 0; j < arr.length -1 - turn ; j++){
                //swaping of the number 
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
            }
        }
    }

    public static void SelectionSort (int arr[]){
        for(int i = 0 ; i < arr.length-1 ;  i++ ){
            int minPos  = i ;
            for(int j = i+1 ; j < arr.length-1 ; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            // swapping of the numbers 
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;

        }
    }

    public static void printArr (int arr[]){
        for(int i = 0 ; i < arr.length ; i ++){
            System.out.print(arr[i]+" ");

        }

        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 5 no.");
        int arr[] =  new int[5];
        for (int i = 0 ;  i < arr.length ; i ++){

         arr[i] = sc.nextInt();
        }
        
    //    int arr[] = {1,4,5,12,0};
    //    BubbleSort(arr);
    SelectionSort(arr);
       printArr(arr);
    }
}