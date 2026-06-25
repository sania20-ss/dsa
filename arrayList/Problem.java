import java.util.*;

public  class  Problem {
    public  static  void  main (String args[]){
        ArrayList<Integer> list =  new  ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(7);
        list.add(6);
        list.add(0);
        System.out.println(list);


        // reverse  print  - O(n)
    //     for (int i = list.size() -1 ;  i >= 0   ;  i--){
    //         System.out.print(list.get(i) + " ");
    //     }
    //     System.out.println();
    // }

    //  max  in an  arraylist 
    int max =  Integer.MIN_VALUE;
    for (int i = 0 ;  i < list.size() ; i++){
        // if (max < list.get(i)){
        //     max =  list.get(i);
        // }
       max = Math.max (max , list.get(i));
    }
       System.out.println(max);


    //   swap  2 no.s 
     
    }
}