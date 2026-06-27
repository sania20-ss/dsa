
import java.util.ArrayList;

//  just  like  2d  array  we have  multi dimensional  array  

public class MultiDim{
    
    //  ********basic  multi dim  array **************
    // public  static void main(String args[]){
    // ArrayList<ArrayList <Integer>> mainList =  new  ArrayList<>();
    // ArrayList<Integer> list =  new  ArrayList<>();
    // list.add(1); list.add(2);
    // mainList.add(list);
    
    // ArrayList<Integer> list2 =  new  ArrayList<>();
    // list2.add(3);
    // list2.add(4);
    // mainList.add(list2);

    // for(int i = 0 ;  i < mainList.size() ; i++){
    //      ArrayList<Integer> currList = mainList.get(i);
    //       for (int j = 0 ;  j < currList.size(); j++){
    //         System.out.print(currList.get(j) + " ");
    //       }
    //       System.out.println();
    // }
    // System.out.print(mainList);
      // }

//          *************** [[1, 2, 3, 4, 5], [2, 4, 6, 8, 10], [4, 8, 12, 16, 20]]    printing this  sequence  ***************
      public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new  ArrayList<>();
        ArrayList<Integer> list2 = new  ArrayList<>();
        ArrayList<Integer> list3 = new  ArrayList<>();

        for (int i = 1 ; i <= 5 ; i++){
          list.add(i);
          list2.add(i*2);
          list3.add(i*4);
        }

        mainList.add(list);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);

        for (int i = 0 ;  i < mainList.size(); i++){
          ArrayList<Integer>  currList =  mainList.get(i);
          for(int j = 0 ; j < currList.size(); j++){
            System.out.print(currList.get(j) +" ");
          }
          System.out.println();
        }

      }  
}