// Week1 Day4 - Check Palindrome
import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();
String rev="";
for(int i=str.length()-1;i>=0;i--)
{
  rev+=str.charAt(i);
if(str.equals(rev))
{
  System.out.println("palindrome");
}
else
{
  System.out.println("Not palindrome");
}
}



    