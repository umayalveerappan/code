
//program to generate random numbers using enhanced for loop

import java.util.Random
public class Random
{
 Public static void main(String a[])
  {
     Random r=new Random();
     int a[]=new int[10];
     for(int i=0;i<10;i++)
     {
        a[i]=r.nextInt(50);
     }
     for(int n:a)
     {
       System.out.println(n);
     }
   }
}   
