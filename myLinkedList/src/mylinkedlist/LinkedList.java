
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
    
    
    public void deleteFirst(){
        if(head == null)            //list is empty
            return;
        if(head.next == null)       //only one node 
            head = tail = null;
        else{                       //more than one node
            Node temp = head;       //holder for the head   
            head = head.next;       //moving head to next reference
            temp = null;            //freeing the temp variable
        }
    }
    
    public void deleteLast(){
        if (head == null)                       //list is empty
            return;
        if(head.next == null)                   //only one node
            head = tail = null;
        else{                                   //more than one node
            Node temp = head;
            while((temp.next).next != null){    // goes upto 2nd last node
                temp = temp.next;
            }
            tail = temp;                        //tail is pointing to 2nd last node
            temp.next = null;                   //cutting the link to previous last node
        }
    }
    
}
