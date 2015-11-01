public class ColorChoice{
    
  public static long chooseColor(long m, int n){
    long fac = 1;

    for(int i = 1 ;i <= n /2 ; i++){
        fac = fac * (n + 1 - i) / i; 
        if(fac == m)
            return i;
    }

    return -1;
  }

  public static void main(String[] args){
      System.out.println(ColorChoice.chooseColor(221,12));
  }
}
