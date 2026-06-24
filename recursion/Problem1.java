
public class Problem1 {
// print  no. from  n  to  1  (decreasing  order)

    public static void printDec(int n) {
        if (n == 1) {    // base  class 
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);  //recursive func
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    //  calculating  factorial 
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fnm1;
        return fn;

    }

    // sum  of  1st  n  natural  no.s 
    public static int natural(int n) {
        if (n == 1) {
            return 1;
        }
        int RSum = natural(n - 1);
        int sum = n + RSum;
        return sum;

    }

    // fibonacci  series /  numbers
    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fibo(n - 1) + fibo(n - 2);
    }

//     check  array  is  sorted  or  not 
    public static boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

//    first  occurence  of  an  element in  an  array  


   public static  int firstO(int[] arr, int  key , int  i){
      if (i ==  arr.length){
        return -1 ;
      }
     if (arr[i] == key){
        return i; 
     } 
      return firstO(arr, key, i+1); 
     
     }

    //   print  x to  the  power  n 
    public  static  int  power(int x , int n){
         
        if (n == 0  ){
            return 1 ;
        }
         int  xnm1 = power(x , n-1);
         int  xn =  x*  xnm1 ;
         return xn ;

    }

    //  optimized  power  
     

    public static void main(String args[]) {
        //   int n = 25;
        //   printDec(n);    
        // printInc(n);    
        //  System.out.print(fact(n)); 
        //  System.out.print(natural(n));

        // System.out.print(fibo(n));
        // int[] arr = {1,2, 3, 5, 6, 5};
        // System.err.print(firstO(arr, 6 , 0));

        int  x = 5 ;
        System.out.print(power(x, 0));
        // System.out.print(isSorted(arr, 0));

    }
}

// last  occurrence 
// first  occurrence  
