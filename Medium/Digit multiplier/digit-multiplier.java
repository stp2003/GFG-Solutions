//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            Long N = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.getSmallest(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static String getSmallest(Long n) {
        // code here
        if(n==1)return "1";
        int i = 9;
		StringBuilder ans = new StringBuilder();
		while(n>1 && i>1){
			if(n%i ==0){
				ans.append(i);
				n = n/i;
			}else{
				i--;
			}
		}
		ans.reverse();
		if(ans.toString().equals("") || n>1)return "-1";
		return ans.toString();
    }
};