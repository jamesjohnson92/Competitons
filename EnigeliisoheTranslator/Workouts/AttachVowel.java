public class AttachVowel{
  
  public static void main(String[] args){
    //AttachVowel attach  = new AttachVowel();
    //System.out.println(attach.attachChar('y'));
    //System.out.println(AttachVowel.attachChar('y'));
  }
    
  
  public static String attachChar(char holder){
    char[] vowels = new char[]{'a','e','i','o','u'};
    String result = "";
    for(int i = 0; i < vowels.length; i++){
      if(holder < vowels[i]){
        result = String.valueOf(holder).concat(String.valueOf(vowels[i-1]));
        break;
      }

    }

    result = (("vwxyz").indexOf(holder) != -1)?String.valueOf(holder).concat(String.valueOf('u')):result;
    return result;
  }  

}
