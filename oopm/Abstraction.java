// Abstraction  
// hiding  all the  unnecessary  details  and  showing only  the  important  parts  to the user 

// difference  between  abstraction(data hiding )  and  encapsulation (data  binding ) 


// **implementation  of  Abstraction  through **
/*  - Abstract  clasess
    - Interfaces 
  
*/

/*
 ***  Abstract  class **
  -  to  make  (write  "abstract"  keyword  before  the  class u want  to  make  abstract)
    eg .  abstract  ClassA {}
  
  1.  Cannot  create  an  instance(object)  of  abstract  class 
        object --   Car myCar = new Car(); 

  2.  Can  have  abstract /  non-abstract  methods 

  3. can  have  constructors
*/


/*  
***interfaces  ***  
 blueprint of  class  
 -  use  multiple inheritance  
 -  to  achieve  total  abstraction  
-   defined  by  interface keyword 

to inherit  class  we  write  extend  but to  inherit  interfece  we  do 'implements '

1.  all the  methods  are  by  default  public  ,  abstract  and  without implementation 
2. used  to  achieve  total  abstraction  
3 . variables in the interfaces are  final  ,  public  and  static

 ***superinterface ****** 
*/


import  java.util.*;

public class Abstraction {
  public  static  void  main(String  args[]){
  Queen  q =  new  Queen();
  q.moves();
  }
}

interface chessPlayer{
  void  moves();
}

class  Queen  implements chessPlayer{
  public void moves(){
    System.out.print("move  in all direction ");
  }

}

class King implements chessPlayer{
  public void moves(){
    System.out.print("move  in all direction ");
  }

}


// static keyword (a  constant thing )
/*
  used  to  share  smae  variable  or  method  of  a  given  class 
  - properties 
  - funtions
  - blocks 
  - nested  classes   

*/ 

class Student  {
  String name; 
  int roll ;

  static String  schoolName ;

  void setName (String name){
    this.name =  name;
  }
  void getName(){
    return this.name;
  }
}
// in this code  if  we  create  objet  of 
//  student  1  and  declare its  schoolNmae then 
//  when i will  print the  schoolNamem of  the  Studnet  2  i will get the  
// same schoolName as it is  static  for  all  

// **  Super  keyword ****

/* 
  its is used  in immediate  parent  class  object  
   -  to  acces  parent's  prop 
   -  to  access parent's function
   -  to  access  parent's constructor

    this ---> used  to  refer to the current  object  

*/


class  Animal{
  Animal(){
    String  color ;
    System.out.println("animal  constructor  called ");
  }
  
}

class Horse  extends Animal{
  Horse(){
    super();
    super.color = "red";   //immediate  parent  class is  called 
    System.out.println("horse  constructor ");
  }
}

public class Abstraction {
  public  static  void  main(String  args[]){
    Horse h =  new  Horse();
    System.out.println(h.color);
  }
}

