//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
class insertion
{
    Node head;  
    Node tail;
	public void addToTheLast(Node node) 
	{
	  if (head == null) 
	  {
	   head = node;
	   tail = node;
	  } 
	  else 
	  {
	   tail.next = node;
	   tail = node;
	  }
	}
      void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	/* Drier program to test above functions */
	public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
         {
			int n = sc.nextInt();
			insertion llist = new insertion(); 
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new Node(a));
			}
			
        Solution ob = new Solution();
		head = ob.insertionSort(llist.head);
		llist.printList(head);
		
        t--;		
        }
    }}
// } Driver Code Ends


//User function Template for Java

/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    */
class Solution
{
    public static Node insertionSort(Node head)
    {
        //code here
        
        ArrayList<Integer> v = new ArrayList<>();
        Node p = head;
        
        while(p != null) 
        {
            v.add(p.data);
            p = p.next;
        }
        
        for(int i = 1; i < v.size(); i++) 
        {
            int temp = v.get(i), j = i - 1;
            
            while(j >= 0 && v.get(j) > temp) 
            {
                v.set(j + 1, v.get(j));
                j--;
            }
          
            v.set(j + 1, temp);
        }
        
        Node dummy = new Node(0);
        p = dummy;
        
        for(int i: v) 
        {
            p.next = new Node(i);
            p = p.next;
        }
        
        return dummy.next;
        
    }
}