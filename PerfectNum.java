import java.util.Scanner;
public class Perfect
{
        static boolean check(int num)
        {
            int sum = 0;
            for(int i=1; i<num; i++)
            {
                if(num%i==0)
                {
                    sum = sum+i;
                }
            }
            if(sum==num)
                return true;
            else
                return false;
        }
        public static void main(String[] args)
        {
            Scanner sc = new Scanner (System.in);
            System.out.println("enter the value for n");
            int n = sc.nextInt();
            for(int i=1; i<=n; i++)
            {
                if(check(i))
                    System.out.println(i);
            }
        }
 
 
}