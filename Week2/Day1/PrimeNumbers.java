//Week2 Day1 - Print Prime NUmbers

public class PrimeNumbers{

public static void main(String[]args)
{
 System.out.println("Prime numbers between 1 and 50 are:");

for(int num=2;num<=50;num++)
{
 boolean isPrime=true;

for(int i=2;i<=num/2;i++)
{
  if(num % i == 0)
{
  isPrime = false;
  break;
}
}

if(isPrime)
 System.out.println(num+ " ");
}

}}