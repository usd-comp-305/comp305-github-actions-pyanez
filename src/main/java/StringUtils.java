/**Utility class for String functions.
 *
 */

public class StringUtils {
    /**
     * Private constructor for public utility class.
     */
    private StringUtils(){
    }

    /**
     * Reverses a word based on given string value.
     * @param wordToReverse string that is reversed
     * @return the reversed string
     */
    public static String reverseString(final String wordToReverse){
        return new StringBuilder(wordToReverse).reverse().toString();
    }
}
