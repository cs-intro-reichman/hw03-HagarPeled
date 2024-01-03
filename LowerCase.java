/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String str) {
    int i=0;
    String answer = "";
    while (i< str.length()) {
        char currentChar= str.charAt(i);
       
        if (Character.isUpperCase(currentChar)) {
            answer+= (char) (currentChar+32);
        } else {
            answer+= currentChar;
        }

        i++;
    }

        return answer;
    }
}
