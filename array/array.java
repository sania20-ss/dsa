import java.util.*;
// array - list of element of same type placed in contiguous memmory location 
// create 
// input
// output
// update
public class array {

    // public static void array(){
        
    // }
    public static void main(String args[]){
      int marks[] = new int[50];
       Scanner sc = new Scanner(System.in);
       marks[0] = sc.nextInt();
       marks[1] = sc.nextInt();
       marks[2] = sc.nextInt();
      
      System.out.println("phy :"+marks[0]);
      System.out.println("chem :"+marks[1]);
      System.out.println("math :"+marks[2]);

      marks[0] = marks[0]+1;
      int percentage =  (marks[0]+marks[1]+marks[2])/3;
      System.out.println("percentage "+ percentage+"%");
      System.out.println("phy :"+ marks[0]);
    }
}