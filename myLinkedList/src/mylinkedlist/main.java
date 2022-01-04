
package mylinkedlist;

import java.util.Arrays;


public class main {

    public static void main(String[] args) {
     
        LinkedList list = new LinkedList();
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        System.out.println("Index of 6 is " + list.indexOf(6));
        //list.addFirst(20);
        //list.addFirst(10);
        //list.deleteFirst();
        System.out.println("Does list contains 5: " + list.contains(5));
        System.out.println("The size of the list is: " + list.size());
        list.print();
       
        
        var arr = list.toArray();
        System.out.println(Arrays.toString(arr));
        System.out.println("3rd item from last: " + list.getKthFromEnd(3));
       
        list.reverseList();
        var arr1 = list.toArray();
        System.out.println(Arrays.toString(arr1));

    }
    
}
