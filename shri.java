import java.util.Scanner;

public class shri 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of key=");
        int key=sc.nextInt();
        switch (key) 
        {
            case 1:
                for(int i=0;i<=7;i++)
                {
                if(i==4)
                {
                  continue;
                }
                System.out.println(i);
                }
                break;

            case 2:
                for(int i=0;i<=7;i++)
                {
                if(i==4)
                {
                  break;
                }
                System.out.println(i);
                }
                break;
            default:
                break;
        }
        sc.close(); 
    }
}
