package edu.sandiego.comp305;

/**
 * Utility methods
 */
public class StringUtils {

    private StringUtils() {
        // Prevents instantiation
    }

    /**
     * Reverses the string.
     * @param input is the string to reverse
     * @return Inverted String
     */
    public static String reverseString(final String input) {
        return new StringBuilder(input).reverse().toString();
    }
}



