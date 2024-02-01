//{ Driver Code Starts
//Initial template for JAVA

import java.lang.*;
import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for JAVA

class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String s) {
        // your code here
        
        s = s.toLowerCase();
        HashSet<Character> set = new HashSet<>();
        for(char ch = 'a' ; ch <= 'z' ; ch++){
            set.add(ch);
        }
        for(int i = 0; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(!(ch >= 'a' && ch <= 'z'))continue;
            if(set.contains(ch)){
                set.remove(ch);
            }
        }
        if(set.size() == 0)return true;
        else return false;
        
    }
}

//{ Driver Code Starts.

class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  int t=Integer.parseInt(br.readLine());
	  while(t-->0)
	  {
	    String s=br.readLine().trim();
	    
	    System.out.println(new Solution().checkPangram (s)==true?1:0);
	  }
	  
	 }
}
// } Driver Code Ends