public class Main{

  public static String toexuto(String text){
     StringBuilder build = new StringBuilder();
     for(String string : text.split(" ")){
       String concatChar = "";
       for(char i : string.toCharArray()){
     	 if(isVowel(i))
    	    concatChar = concatChar.concat(new Character(i).toString());
	     else if(Character.isLetter(i))
	        concatChar= concatChar.concat(considerCase(i));
    	 else
	        concatChar = concatChar.concat(String.valueOf(i));
       }
	   build.append(concatChar);
       build.append(" ");
      }
        return build.toString();
     }

    public static boolean isVowel(char c){
        return ("AEIOUaeiou".indexOf(c) != -1)?true:false;
    }
   
    public static String considerCase(char holder){
        boolean isUpperCase =  Character.isUpperCase(holder);
        
        String result = attachChar(Character.toLowerCase(holder));

        if(isUpperCase){
            result = result.substring(0,1)
                           .toUpperCase()
                           .concat(result.substring(1));                
        }
        return result;
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
   
    public static void main(String[] args){
        System.out.println(Main.toexuto("This is a test. This is only a test."));
    }
    

}
