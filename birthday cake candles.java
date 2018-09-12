import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
         arr[i]=sc.nextInt();   
        }
        int count=0,h=0;
        h=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>h)
                h=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]==h)
                count++;
        }
        System.out.print(count);
    }
}
