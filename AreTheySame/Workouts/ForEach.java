public class ForEach{
  
  public static void main(String[] args){
    int[] brr = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
    boolean check = false;
    for(int b : brr ){
       int result =  (int) Math.sqrt(b);
       if(!isElement(result)){
           check = true;
           break;
       }
    }

    if(check)
        System.out.println("Not Equal");   
    else
        System.out.println("Equal");

  }

  public static boolean isElement(int num){
    int[] arr = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
    for(int a : arr){
        if(a == num)
            return true;
    }
    return false;
 }
}
