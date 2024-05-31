//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.swapNibbles(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static int swapNibbles(int n) {
        // code here
        int ans=0;
        int x=1;
        int multi1=16;
        int multi2=1;
        for(int i=0;i<8;i++){
          if(i<4){
              int a=(n&(x<<i))!=0?1:0;
              ans+=(multi1*a);
              multi1=multi1*2;
          }
          else{
              
              int b=(n&(x<<i))!=0?1:0;
              ans+=(multi2*b);
            
              multi2=multi2*2;
              
          }
       
        
      }
      return ans;
    }
}