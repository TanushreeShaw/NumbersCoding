import java.util.*;
public class NaturalNumbersSum 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,i,sum=0;
        System.out.println("Enter the value of N:");
        n=in.nextInt();
        System.out.println("The Sum of Natural Numbers is:");
        for(i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
}