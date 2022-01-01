
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
        else{                       //at least one node
            temp.next = head;       //else temp.next is pointing to add
            head = temp;            //updata the head 
        }
        
    }
    
}
