import java.util.*;

// argument------1. pass by value main  2. by reference func 

public class argument{
    public static void update(int marks[]){
        for(int i = 0; i<marks.length; i++){
            marks[i] = marks[i]+1;
        }
    }
    public static void main(String args[]){
      int marks[] = {20,30,40};
      update(marks);

    //   to print the marks 
    for(int i=0; i<marks.length;  i++){
        System.out.print(marks[i]+" ");

    }
    System.out.println();
    }
} 