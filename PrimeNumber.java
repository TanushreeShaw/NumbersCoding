import java.util.*;
public class PrimeNumber
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num,i,f=0;
        System.out.println("Enter a Number:");
        num=in.nextInt();
        
        for(i=2;i<num;i++)
        {
            if(num%i==0)
            {
                f=1;
                break;
            }
            
        }
        
        if(num==1)
            System.out.println(num+" is neither a Prime nor a Composite Number.");
        else if(f==1)
            System.out.println(num+" is not a Prime Number");
        else
            System.out.println(num+" is a Prime Number");
    }
}