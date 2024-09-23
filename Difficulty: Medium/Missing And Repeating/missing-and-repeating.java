//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[]) {
        // code here
        
        long n=arr.length;
        int repeatingNum=0,curSum=0;
        long asum= ((n*(n+1))/2);
        
        for(int i:arr) {
            
            int ind=Math.abs(i);
            if(arr[ind-1]<0)
                repeatingNum=ind;
            else
                arr[ind-1] *=-1;
            curSum+= ind;
        }
        
        
        int[] res = new int[2];
        res[0] = repeatingNum;
        res[1] = (int)asum - curSum + repeatingNum;
        
        return res;
    }
}