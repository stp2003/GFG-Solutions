//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s[] = read.readLine().split(" ");
            int N = Integer.parseInt(s[0]);
            int M = Integer.parseInt(s[1]);
            int A[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String S[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    A[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution ob = new Solution();
            System.out.println(ob.minRow(N, M, A));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int minRow(int n, int m, int a[][]) {
        // code here
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int resultIndex = 1;
        int index = 1;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum += a[i][j];
            }
            
            if (sum < min){
                min = sum;
                resultIndex = index;
            }
            
            index++;
            sum = 0;
            
        }
        
        return resultIndex;
    }
};