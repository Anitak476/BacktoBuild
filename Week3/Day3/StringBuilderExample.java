package week3;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Anita");
        System.out.println("Original: " + sb);

        sb.append(" Kosuri");
        System.out.println("After Append: " + sb);

        sb.insert(5, " Durga");
        System.out.println("After Insert: " + sb);

        sb.delete(5, 11);
        System.out.println("After Delete: " + sb);

        sb.reverse();
        System.out.println("After Reverse: " + sb);
    }
}
