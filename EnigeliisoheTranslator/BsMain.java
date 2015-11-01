public class BsMain{

  public static String toexuto(String text){
    
    StringBuilder sb = new StringBuilder("");
    char c ;
    for(int i = 0; i < text.length() ; i++){
        sb.append(text.charAt(i));
        c = Character.toLowerCase(text.charAt(i));

        if(!Character.isAlphabetic(c)
           || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            continue;
        }       
         
        if(c < 'e') sb.append('a');
        else if(c < 'i') sb.append('e');
        else if(c < 'o') sb.append('i');
        else if(c < 'u') sb.append('o');
        else sb.append('u');         
    }
    
    return sb.toString();
  
  }


  public static void main(String[] args){
   System.out.println(BsMain.toexuto("This is a test too."));  

  }
}
