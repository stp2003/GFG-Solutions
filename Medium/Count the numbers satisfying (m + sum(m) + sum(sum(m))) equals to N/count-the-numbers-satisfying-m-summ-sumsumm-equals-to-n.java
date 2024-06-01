//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.countOfNumbers(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static int sumOfDigits(int n)
    {
        int sum = 0;
        while(n>0)
        {
            int rem = n%10;
            sum +=rem;
            n /= 10;
        }
        return sum;
    }
    static int countOfNumbers(int N){

        int count=0;
        for(int i=N-97;i<=N;i++)
        {
            if(i+sumOfDigits(i)+sumOfDigits(sumOfDigits(i))==N)
                count++;
        }
        return count;
    }
}