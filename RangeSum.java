import java.util.*;
public class RangeSum 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n1,n2,i,sum=0;
        System.out.println("Enter the value of N1:");
        n1=in.nextInt();
        System.out.println("Enter the value of N2:");
        n2=in.nextInt();

        System.out.println("The Sum of Natural Numbers is:");
        for(i=n1;i<=n2;i++)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
    
}
