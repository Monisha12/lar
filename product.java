import java.io.*;
import java.util.*;
import java.util.Arrays;
public class product
{
public static void main(String args[])
{
int i,j,k,m=1;
int arr[]=new int[args.length];
for(i=0;i<args.length;i++)
{
arr[i]=Integer.parseInt(args[i]);
}
for(j=0;j<args.length;j++)
{
for(k=0;k<args.length;k++)
{
if(j!=k)
{
m=m*arr[k];
}
}
System.out.print(m +" ");
m=1;
}
}
}
