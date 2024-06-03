//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            Long N = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.totalMoney(N));
        }
    }
}

// } Driver Code Ends


class Solution{
    static Long totalMoney(Long N){
        // code here
        
        long j = 3, k = j;
        
        while (j < N) {
            k *= 2;
            j += k;
        }
        
        return j - N + 1;
    }
}

