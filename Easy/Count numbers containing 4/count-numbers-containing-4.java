//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            int res = obj.countNumberswith4(n);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends



class Solution {
    
    public static boolean contains(int n) {
        
        while(n > 0) {
            int r = n % 10;
            
            if(r == 4)
              return true;
              
            n = n / 10;
        }
        
        return false;
    }
    
    public static int countNumberswith4(int n) {
        int c = 0;
        
        for(int i = 4; i <= n; i++) {
            if(contains(i))
              c += 1;
        }
        
        return c;
    }
    
}
