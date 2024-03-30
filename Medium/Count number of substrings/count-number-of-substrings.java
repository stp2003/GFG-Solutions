//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
            int k = sc.nextInt();
    		System.out.println (new Solution().substrCount (s, k));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    long substrCount (String S, int K) {
        // your code here
        return count(S,K)-count(S,K-1);
    }
    
    long count(String s, int k){
        int arr[] = new int[26];
        int dist = 0, i = 0,j=0;
        long res = 0;
        while(j<s.length()){
            arr[s.charAt(j) - 'a']++;
            if(arr[s.charAt(j) - 'a'] == 1) 
            dist++;
            while(dist > k){
                arr[s.charAt(i)-'a']--;
                if(arr[s.charAt(i)-'a'] == 0) 
                dist--;
                i++;
            }
            res = res + (j-i+1);
            j++;
        }
        return res;
    }
    
    
    
}