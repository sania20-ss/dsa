import  java.util.*;

public class  Solution{
    public static void main(String[] args){
        Scanner  sc  = new  Scanner(System.in);
        int n = sc.nextInt();
        String A = sc.next();
        String B =  sc.next();
        
        for(int i = 0 ;  i < n ;  i++){
            if (A.charAt(i) < B.charAt(i)){
                System.out.println(-1);
                return;
            }
        }
        
        HashSet<Character> set =  new HashSet<>();
        
        for(int i = 0 ;  i < n ;  i ++ ){
            if(A.charAt(i) != B.charAt(i) ){
                set.add(B.charAt(i));
            }
            
        }
        
        System.out.println(set.size());
    }
}