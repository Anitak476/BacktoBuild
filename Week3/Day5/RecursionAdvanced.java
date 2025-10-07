package week3;

public class RecursionAdvanced {
    public static void main(String[] args) {
        System.out.println("Tower of Hanoi with 3 disks:");
        towerOfHanoi(3, 'A', 'C', 'B');

        String str = "madam";
        System.out.println("\nPalindrome check for '" + str + "': " + isPalindrome(str, 0, str.length() - 1));
    }

    static void towerOfHanoi(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }
        towerOfHanoi(n - 1, from, aux, to);
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        towerOfHanoi(n - 1, aux, to, from);
    }

    static boolean isPalindrome(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return isPalindrome(s, start + 1, end - 1);
    }
}
