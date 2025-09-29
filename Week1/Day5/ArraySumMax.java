// Week1 Day5 - Array Sum and Max
public class ArraySumMax {
    public static void main(String[] args) {
        int[] arr = {3, 6, -2, -5, 7, 3};
int sum=0;
int max=arr[0];
for(int n:arr)
{
 sum+=n;
if(n>max)
{
(max=n);
}
}
System.out.println("sum:" + sum);
System.out.println("Max:" + max);
}
}


