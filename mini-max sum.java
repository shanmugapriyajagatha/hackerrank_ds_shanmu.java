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
        int arr[]=new int[5];
        int sum=0,max=0,min=100000;
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
            sum+=arr[i];
            if(arr[i]>max)
                max=arr[i];
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.print((sum-max)+" "+(sum-min));
    }
}
