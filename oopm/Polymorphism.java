//  poly  is  of  2  types -  compiler  time  and  run time  
//  example ----  types  of  constructor  like  copy  contructor  ,  parametris  constructor  

// -  compiler  time (method  overloading ) ---  its  a  static  one 


//  -----------method  overloading  ---------------
    //    its  is  when  we  make  same  name funtions  with  diffeent paramenter  such  as  datatype  and  count 
    //  eg -  sum(int a,  int b ) ,  sum(float a ,  float b) ,  sum (int a  , int b , int c )

// - run time (method  overriding )--------- its  a  dynamic one 
    

import java.util.*;

public class Polymorphism{
    public static  void  main(String args[]){
       Calculator calc =  new  Calculator();
       System.out.println(calc.sum(1,2));
       System.out.println(calc.sum((float)1.5,(float)2.1));
       System.out.println(calc.sum(1,2,4));    
    }

}

// method  overloading  
class Calculator{
    int  sum(int a , int  b){
        return a + b;
    }

    float  sum(float a , float b){
        return a + b;
    }

    int  sum(int  a , int b , int  c){
        return a + b + c ;
    }

}

// method  overrriding 

class  Animal {
    void  eat(){
    System.out.println("eats  anything ");}
}
class  Deer  extends Animal{
    void  eat(){
        System.out.println("eat  graas")
    }
}

public  static void  main (String args[]){
    Deer  d =  new  Deer();
    d.eat();     // eats  grass is the output  
}

// same  funtions  are present in diffenret  class  and  perform  same action method  overrrdiing 