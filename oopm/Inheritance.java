import  java.util.*;

public class Inheritance{
 public  static  void  main(String[] args){
    Dog doggy = new Dog();
     doggy.eat()    //thing  funtion  is present in the  animal 
     doggy.legs = 4 ;
     System.out.println(doggy.legs);
  }

} 

//  base class 
  class  Animal{
    String  color ;
     void  eat(){
        System.out.println("eating ");

     }
     void  breathe(){
        System.out.println("breathing ");
     }
  }

//   derived  class 
   class Fish extends Animal{
    int  fins;
    void  swim(){
        System.out.println("swims ");
    }
   }

   //  this  is  called  the multilevel  inheritance  

   class Mammal extends Animal {
      int legs ;

   }

   class Dogs extends Mammal{
      String  breed ;
   } 

   //  calling dog in the main fucntion  
   // public  static void  main (String args[]){
   //   Dog doggy = new Dog();
   //   doggy.eat()    //thing  funtion  is present in the  animal 
   //   doggy.legs = 4 ;
   //   System.out.println(doggy.legs);

   // }


   //  for hierarichial  class
   // for hybrid  inheritance  


//   -------------***************** ----------------------------
   // there  is  multiple inheritance  in which  the  a - b is connect to  c  down  
   // this is  called  interface  in java  