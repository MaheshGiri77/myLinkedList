
package mylinkedlist;

/**
 *
 * @author mahes
 */
public class LinkedList {
    private class Node{
        private int val;
        private Node next;
        public Node(int val){
            this.val = val;
        }
    }
    
    private Node head;
    private Node tail;
    
    public void addFirst(int val){
        Node temp = new Node(val);
        if(head == null)            //empty linked list
            head = tail = temp;
        else{                       //else at least one node
            temp.next = head;       //temp.next is pointing to head
            head = temp;            //update the head 
        }
        
    }
    
    public void addLast(int val){
        Node temp = new Node(val);
        if(head == null)            //empty linked list
            head = tail = temp;
        else{                       //else at least one node
            tail.next = temp;       //tail.next is pointing to temp       
            tail = temp;            // update the tail
        }
    }
    
}
