package week3;
import java.util.Scanner;

public class StringPrograms {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // length()
        System.out.println("\n1️⃣ Length of string: " + input.length());

        // charAt()
        System.out.println("2️⃣ Character at index 2: " + input.charAt(2));

        // toUpperCase() and toLowerCase()
        System.out.println("3️⃣ Uppercase: " + input.toUpperCase());
        System.out.println("4️⃣ Lowercase: " + input.toLowerCase());

        // substring()
        if (input.length() > 4) {
            System.out.println("5️⃣ Substring (2,5): " + input.substring(2, 5));
        }

        // contains()
        System.out.println("6️⃣ Contains 'a'? " + input.contains("a"));

        // equals() and equalsIgnoreCase()
        System.out.println("7️⃣ Equals 'Java'? " + input.equals("Java"));
        System.out.println("8️⃣ EqualsIgnoreCase 'java'? " + input.equalsIgnoreCase("java"));

        // startsWith() and endsWith()
        System.out.println("9️⃣ Starts with 'H'? " + input.startsWith("H"));
        System.out.println("🔟 Ends with 'a'? " + input.endsWith("a"));

        // replace()
        System.out.println("11️⃣ Replace 'a' with '@': " + input.replace('a', '@'));

        // trim()
        System.out.println("12️⃣ Trimmed: '" + input.trim() + "'");

        // split()
        System.out.println("\n13️⃣ Split words:");
        String[] words = input.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        // indexOf() and lastIndexOf()
        System.out.println("\n14️⃣ First index of 'a': " + input.indexOf('a'));
        System.out.println("15️⃣ Last index of 'a': " + input.lastIndexOf('a'));

        sc.close();
    }
}
