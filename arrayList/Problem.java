import java.util.*;

// collections ----> class
// collection -----> interface 
public  class  Problem {
    // function or  swaping  2  no.s 
    public  static void  swap (ArrayList<Integer> list,  int idx1 , int idx2 ){
     int  temp = list.get(idx1);
     list.set(idx1 , list.get(idx2));
     list.set(idx2 , temp);
    }

    // sorting in an  ArrayList
    // we  have  inbuil method  for  sorting in array list 
    //  Collection.sort()

    public  static void  Sort(ArrayList<Integer> list){
        // ascending  order  sorting 
    //    Collections.sort(list);

    //  descending order  sorting 
       Collections.sort(list , Collections.reverseOrder());  // comparators -  fnx 
    }
    public  static  void  main (String args[]){
        ArrayList<Integer> list =  new  ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(7);
        list.add(6);
        list.add(0);
        System.out.println("list  before " +list);


        // reverse  print  - O(n)
    //     for (int i = list.size() -1 ;  i >= 0   ;  i--){
    //         System.out.print(list.get(i) + " ");
    //     }
    //     System.out.println();
    // }

    //  max  in an  arraylist 
    // int max =  Integer.MIN_VALUE;
    // for (int i = 0 ;  i < list.size() ; i++){
    //     // if (max < list.get(i)){
    //     //     max =  list.get(i);
    //     // }
    //    max = Math.max (max , list.get(i));
    // }
    //    System.out.println(max);

    //   swap  2 no.s 
    //   int idx1 =  1 , idx2 = 3   ;
    //   swap(list, idx1, idx2);
    //   System.out.print("after  swapping "+ list);   
    
    // sorting  
    Sort(list);
    System.out.println("sorted  array" + list);

    }


}