//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int N = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.factorial(N);
            for (Integer val: ans) 
                System.out.print(val); 
            System.out.println();
        }   
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static ArrayList<Integer> factorial(int N){
        //code here
        
        ArrayList<Integer> a=new ArrayList<>();
        a.add(1);
        for(int i=2;i<=N;i++){
            multiply(a,i);
        }
        Collections.reverse(a);
        return a;
    }
    static void multiply(ArrayList<Integer> a,int n){
        int c=0;
        for(int i=0;i<a.size();i++){
            int p = a.get(i)*n + c;
            a.set(i,p%10);
            c=p/10;
        }
        while(c!=0){
            a.add(c%10);
            c/=10;
        }
    }
}