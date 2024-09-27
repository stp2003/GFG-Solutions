//{ Driver Code Starts
// Initial template for JAVA

import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        // taking input using class Scanner
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            // taking total number of elements
            int k = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            ArrayList<Integer> res = new Solution().max_of_subarrays(k, arr);

            // printing the elements of the ArrayList
            for (int i = 0; i < res.size(); i++) System.out.print(res.get(i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function template for JAVA

class Solution {
    // Function to find maximum of each subarray of size k.
    public ArrayList<Integer> max_of_subarrays(int k, int arr[]) {
        // Your code here
        Deque<Integer> deque = new ArrayDeque<>();
       ArrayList<Integer> list=new ArrayList<Integer>();
       int i=0;
       int k_copy=k-1;
       int max=0;
       while(k_copy>=0){
            deque.addLast(i);
            if(arr[i]>arr[max])
                max=i;
            k_copy--;
            i++;
       }
       list.add(arr[max]);
       while(i<arr.length){
           
           if(!deque.isEmpty() && (deque.peekFirst()==max)){
               deque.removeFirst();
               deque.addLast(i);
               Iterator<Integer> it=deque.iterator();
               int temp=-1;
               while(it.hasNext()){
                    int index=it.next();
                    if(temp==-1){
                       temp=index;
                    }
                    if(arr[index]>=arr[temp]){
                        temp=index;
                    }
               }
                max=temp;
           }else{
               deque.removeFirst();
               deque.addLast(i);
               if(arr[i]>=arr[max]){
                   max=i;
               }
           }
           i++;
           list.add(arr[max]);
       }
       return list;
    }
}