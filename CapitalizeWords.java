//Write a java program to capitalize each word in string.


public class CapitalizeWords {
    public static void main(String[] args) {
        String input = "this is a sample string";
        String capitalized = capitalizeWords(input);
        System.out.println("Original String: " + input);
        System.out.println("Capitalized String: " + capitalized);
    }

    public static String capitalizeWords(String str) {
        // Split the string into words
        String[] words = str.split("\\s+");
        StringBuilder result = new StringBuilder();
        
        // Capitalize each word
        for (String word : words) {
            // Check if word is not empty
            if (!word.isEmpty()) {
                // Capitalize first letter of the word and append rest of the word
                result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }
        }
        
        // Remove trailing whitespace and return the capitalized string
        return result.toString().trim();
    }
}
