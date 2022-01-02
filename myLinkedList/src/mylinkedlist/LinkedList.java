
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
    
    public int indexOf(int value){
        if (head == null)                       //if the list is empty
            return -1;
        Node temp = head;
        int index = 0;
        while(temp != null){                    //checks all the item
            if(temp.val == value)
                return index;
            index++;
            temp = temp.next;
        }
        return -1;                              //item not found in the list
    }
    
    public boolean contains(int val){
        return (indexOf(val) != -1);            //returns true if the indexOf(va) != -1 else return false
    }
    
    public int size(){
        int size = 0;
        Node temp = head;
        if(head == null)                        // if the list is empty
            return size;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        return size;
    }
    
    
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
}
