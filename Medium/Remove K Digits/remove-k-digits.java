//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String S = sc.next();
            int K = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.removeKdigits(S, K));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

  public String removeKdigits(String s, int k) {
    // code here

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {

      char c = s.charAt(i);

      while (sb.length() > 0 && sb.charAt(sb.length() - 1) > c && k > 0) {

        sb.deleteCharAt(sb.length() - 1);

        k--;

      }

      if (sb.length() > 0 || c != '0')

        sb.append(c);

    }

    while (sb.length() > 0 && k--> 0) {

      sb.deleteCharAt(sb.length() - 1);

    }

    if (sb.length() == 0)
      return "0";
      
    else 
      return sb.toString();

  }
  
}

