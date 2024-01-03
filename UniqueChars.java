/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String str) {
       String newString= " ";
       int i= 0;
       
       while(i<str.length()) {
        char currentChar= str.charAt(i);

    if (currentChar != ' ' && newString.indexOf(String.valueOf(currentChar)) == -1) {
          newString += currentChar;
     } else if (currentChar == ' ') {
        newString+=' ';
     }
     
     i++;
 }

        return newString.trim();
    } 
 }   
    

