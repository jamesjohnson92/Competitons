public class CaseSensitive{
  
    public static String considerCase(char holder){
        boolean isUpperCase =  Character.isUpperCase(holder);
        
        String result = AttachVowel.attachChar(Character.toLowerCase(holder));

        if(isUpperCase){
            result = result.substring(0,1)
                           .toUpperCase()
                           .concat(result.substring(1));                
        }
        return result;
    }

    /*
    public static void main(String[] args){
       CaseSensitive cas = new CaseSensitive();
        cas.considerCase('h');
    }
    */
}
