package String;

public class demo1 {

	public static void main(String[] args) {
		// String Methods
		// Declare and initialize a string with extra spaces
        String str = " Hello Java ";

        // Print the original string (with leading and trailing spaces)
        System.out.println("Original: " + str); // Output:  Hello Java 

        // Get and print the total number of characters in the string (including spaces)
        System.out.println("Length: " + str.length()); // Output: 12

        // Remove spaces from beginning and end, then print
        System.out.println("Trimmed: " + str.trim()); // Output: Hello Java

        // Convert all characters to lowercase and print
        System.out.println("Lowercase: " + str.toLowerCase()); // Output:  hello java 

        // Convert all characters to uppercase and print
        System.out.println("Uppercase: " + str.toUpperCase()); // Output:  HELLO JAVA 

        // Print a substring from index 1 (inclusive) to 5 (exclusive)
        // Index positions: 0 1 2 3 4 5
        // Characters:      [ ] H e l l o
        System.out.println("Substring (1,5): " + str.substring(1, 5)); // Output: Hello

        // Get the character at index 3 and print
        // Index 3 is 'l' in " Hello Java "
        System.out.println("Character at 3: " + str.charAt(3)); // Output: l

        // Check if the string contains the word "Java" (case-sensitive)
        System.out.println("Contains 'Java'? " + str.contains("Java")); // Output: true

        // Replace the word "Java" with "World" in the string and print the result
        System.out.println("Replaced: " + str.replace("Java", "World")); // Output:  Hello World
	}

}
