
import java.util.ArrayList;

public class arrayList {

    public static void main(String args[]) {
        // String | Boolean 
        // java  collection  framework -  alread  existing  framework  
        ArrayList<Integer> list = new ArrayList<>();
        //  add  operation 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        // get operation 
        int element  = list.get(0);
        //  System.out.println(element);

        // delete  operation 
        list.remove(1);
        // System.out.println(list);

        // set  eleemnt  at  index  
        list.set(3, 10);
        // System.out.println(list);

        // contains  eleement 
        // System.out.println(list.contains(10)); 
        // System.out.println(list.contains(7)); 

       list.add(1,9); // 0(n) 
    //    System.out.println(list);

       list.get(4);
    //    System.out.println("get call"+list);

      System.out.println(list.size());

      for(int  i = 0 ;  i < list.size() ;  i++){
        System.out.print(list.get(i) + " ");
      }
      System.err.println();

    }
}
