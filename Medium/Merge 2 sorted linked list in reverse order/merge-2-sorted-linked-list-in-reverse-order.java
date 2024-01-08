//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}


public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0)
        {
            int N = scanner.nextInt();
            int M = scanner.nextInt();

            Node node1 = null;
            Node temp1 = null;
            for (int i = 0; i < N; i++) {
                int value = scanner.nextInt();
                Node newNode = new Node(value);
                if (node1 == null) {
                    node1 = newNode;
                    temp1 = node1;
                } else {
                    temp1.next = newNode;
                    temp1 = temp1.next;
                }
            }
    
            Node node2 = null;
            Node temp2 = null;
            for (int i = 0; i < M; i++) {
                int value = scanner.nextInt();
                Node newNode = new Node(value);
                if (node2 == null) {
                    node2 = newNode;
                    temp2 = node2;
                } else {
                    temp2.next = newNode;
                    temp2 = temp2.next;
                }
            }
    
            GfG gfg = new GfG();
            Node result = gfg.mergeResult(node1, node2);
    
            printList(result);
        }
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}

// } Driver Code Ends


/* Structure of the node*/
/* class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
} */

class GfG
{
    Node mergeResult(Node node1, Node node2)
    {
	    Node reverseList1 = reverseList(node1);
	    Node reverseList2 = reverseList(node2);
	    
	    if(reverseList1 == null) {
	        return reverseList2;
	    }
	    
	    if(reverseList2 == null) {
	        return reverseList1;
	    }
	    
	    Node prev = new Node(-1);
	    Node head = prev;
	    
	    while(reverseList1 != null && reverseList2 != null) {
	        
	        if(reverseList1.data > reverseList2.data) {
	            Node newNode = new Node(reverseList1.data);
	            prev.next = newNode;
	            reverseList1 = reverseList1.next;
	        }
	        
	        else {
	            Node newNode = new Node(reverseList2.data);
	            prev.next = newNode;
	            reverseList2 = reverseList2.next;
	        }
	        
	        prev = prev.next;
	    }
	    
	    if(reverseList1 != null) {
	        prev.next = reverseList1;
	    }
	    
	    if(reverseList2 != null) {
	        prev.next = reverseList2;
	    }
	    
	    return head.next;
    }
    
    
    Node reverseList(Node head) {
        
        Node prev = null;
        Node curr = head, temp;
        
        while(curr != null) {
            
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        return prev;
    }
}


