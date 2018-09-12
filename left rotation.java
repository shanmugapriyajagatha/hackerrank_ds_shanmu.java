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
        int size=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[size];
        for(int i = 0; i < size; i++) {
            if(n > i) 
                arr[size - n + i] = sc.nextInt();
            else
                arr[i - n] = sc.nextInt();
        }
        
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
}
