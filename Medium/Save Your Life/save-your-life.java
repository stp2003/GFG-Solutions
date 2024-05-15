//{ Driver Code Starts
import java.io.*;
import java.util.*;

// } Driver Code Ends
class Solution{
    static String maxSum(String w,char x[],int b[], int n){
        //code here
        
        int sum=0,max=Integer.MIN_VALUE,start=0,end=0,s=0;
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(x[i],b[i]);
        }
        for(int i=0;i<w.length();i++){
            if(mp.containsKey(w.charAt(i))){
                sum+=mp.get(w.charAt(i));
            }else{
                sum+=w.charAt(i);
            }
            
            if(sum>max){
                max=sum;
                start=s;
                end=i+1;
            }
            if(sum<0){
                sum=0;
                s=i+1;
            }
        }
        return w.substring(start,end);
    }
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String w = read.readLine();
            int n = Integer.parseInt(read.readLine());
            String TE[] = read.readLine().trim().split(" ");
            char x[] = new char[n];
            for(int i = 0;i<n;i++)
            {
                x[i] = TE[i].charAt(0);
            }
            
            String TR[] = read.readLine().trim().split(" ");
            int b[] = new int[n];
            for(int i = 0;i<n;i++)
            {
                b[i] = Integer.parseInt(TR[i]);
            }
           
            Solution ob = new Solution();
            System.out.println(ob.maxSum(w,x,b,n));
        }
    }
}
// } Driver Code Ends