import java.io.*;
import java.util.*;
public class lar
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int ip1=s.nextInt();
        int ip2=s.nextInt();
        int ip3=s.nextInt();
        if(ip1>ip2)
        {
            System.out.println(ip1 +"is largest");
        }
        else if(ip2>ip3)
        {
            System.out.println(ip2 +"is largest");
        }
        else if(ip3>ip1)
        {
            System.out.println(ip3 +"is largest");
        }
        else
        {
            System.out.println("invalid input");
        }
    }
}
