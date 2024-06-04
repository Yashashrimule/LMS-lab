//WAP a program to reverse a given String without using reverse() method.
public class StringReverse1 {
    public static void main(String[] args) {
        String input = "Hello World";
        String reversed = reverseString(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseString(String str) {
        // Convert string to char array
        char[] charArray = str.toCharArray();
        // Length of the string
        int length = str.length();
        
        // Iterate through half of the string
        for (int i = 0; i < length / 2; i++) {
            // Swap characters from start and end
            char temp = charArray[i];
            charArray[i] = charArray[length - 1 - i];
            charArray[length - 1 - i] = temp;
        }
        
        // Convert char array back to string
        return new String(charArray);
    }
}
