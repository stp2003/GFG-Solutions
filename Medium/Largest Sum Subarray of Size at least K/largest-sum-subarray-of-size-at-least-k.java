//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            long k = Long.parseLong(br.readLine().trim());
            
            Solution obj = new Solution();
            System.out.println(obj.maxSumWithK(a, n, k));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {
    
    public long maxSumWithK(long a[], long n, long k)
    {
        long res = Long.MIN_VALUE, sum = 0, prevSum = 0;
        int j = 0;
        
        for(int i = 0; i < k; i++)  
            sum += a[i];
            
        res = Math.max(res, sum);
        
        //** sliding window ->
        for(int i = (int) k; i < n; i++)
        {
            sum += a[i];
            prevSum += a[j++];
            res = Math.max(res, sum);
            
            //** Update the maximum subarray sum if the current sum is greater.
            if(prevSum < 0) 
            {
                //?? If the excluded portion (prevSum) becomes negative, update the sum by subtracting it, 
                //?? and reset prevSum to 0.
                sum -= prevSum;
                res = Math.max(res, sum);
                prevSum = 0;
            }
        }
        
        return res;       
    }
}
