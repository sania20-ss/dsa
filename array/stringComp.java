import  java.util.*;

// ----------------------------
    // string  compression 
// ----------------------------
 
public  class stringComp{
    public  static String  compress (String myStr){
      String newStr = "";
      for (int i = 0 ; i <= myStr.length()-1; i++){
        Integer count =  1 ;  //wrapper  class  (integer) has methods  like  parseInt  and  toString  ,  also  can be used  in ArrayList 
        while (i < myStr.length() -1  && myStr.charAt(i) == myStr.charAt(i+1)){
            count++;
            i++;
        }
        newStr += myStr.charAt(i);
        if (count > 1 ){
            newStr += count.toString(); 
        } 


    }
    return newStr;
    }

    public  static  void  main (String[] args){
    //   String myStr = "abbcccdda"; 
      Scanner  sc =  new  Scanner(System.in);
      String myStr =  sc.next();
      System.out.println(compress(myStr));
    }
}