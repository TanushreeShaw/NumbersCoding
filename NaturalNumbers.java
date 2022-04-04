import java.util.*;
public class NaturalNumbers
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,i;
        System.out.println("Enter the value of N:");
        n=in.nextInt();
        System.out.println("The Natural Numbers are:");
        for(i=1;i<=n;i++)
        {
            System.out.println(i);
        }
    }
}