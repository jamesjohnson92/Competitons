public class Main{
    public static void main(String[] args){
        String input = "This is a test. This is only a test.";
        StringBuilder build = new StringBuilder();
        for(String string : input.split(" ")){
            String concatChar = "";
            for(char i : string.toCharArray()){
                if(isVowel(i))
                    concatChar = concatChar.concat(new Character(i).toString());
                else if(Character.isLetter(i))
                    concatChar= concatChar.concat(CaseSensitive.considerCase(i));
                else
                    continue;
            }
            build.append(concatChar);
            build.append(" ");
        }
        System.out.println(build.toString());
    }

    public static boolean isVowel(char c){
        return ("AEIOUaeiou".indexOf(c) != -1)?true:false;
    }
}
