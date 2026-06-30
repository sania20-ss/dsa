

public  class practice{
    public static void main(String[] args) {
      String s = "apple is good for health";
      String[] word = s.split(" ");
      for (int i = 0 ;  i <= word.length -1  ; i++ ){
        String  first = word[i].substring(0,1).toUpperCase();
        String rest =  word[i].substring(1);

        System.out.print(first + rest + " ");

      }
    }
}