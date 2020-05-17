/*
 * ==========================================
 * CS211, Spring 2020, 5/10
 * Vinh T. Nguyen
 * Homework 06 - Chap 16 EX 8 , 12
 * Exercise 8 - switch the orders of nodes in pairs
 * Exercise 12 - rearrage the negatives values before the non-negatives ones
 * the struggles of students in cs211
 * LinkedIntList class where the magic happens
 * ==========================================
 */

// Class LinkedIntList can be used to store a list of integers.

public class LinkedIntList implements IntList {
    private ListNode front;  // first value in the list

    // post: constructs an empty list
    public LinkedIntList() {
        front = null;
    }

    // post: returns the current number of elements in the list
    public int size() {
        int count = 0;
        ListNode current = front;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    // pre : 0 <= index < size()
    // post: returns the integer at the given index in the list
    public int get(int index) {
        return nodeAt(index).data;
    }

    // post: creates a comma-separated, bracketed version of the list
    public String toString() {
        if (front == null) {
            return "[]";
        } else {
            String result = "[" + front.data;
            ListNode current = front.next;
            while (current != null) {
                result += ", " + current.data;
                current = current.next;
            }
            result += "]";
            return result;
        }
    }

    // post : returns the position of the first occurrence of the given
    //        value (-1 if not found)
    public int indexOf(int value) {
        int index = 0;
        ListNode current = front;
        while (current !=  null) {
            if (current.data == value) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }
     //Exercise 8 - switch the orders of nodes in pairs 
      public void switchPairs(){
         ListNode current = front;  //create a new node
         while(current.next!=null && current.next.next!=null){
              int temp = current.data;
              current.data = current.next.data;
              current.next.data = temp;
            //System.out.print(current.data +""+ current.next.data + " ");
            
            current = current.next.next;
         }
        
      }
      
      //Exercise 12 - rearrage the negatives values before the non-negatives ones
       public void split(){
         int size = this.size() ;
         for (int i = 0; i < size; i++){
            if (this.get(i) > 0){
               this.add(this.get(i));
               this.remove(i);
            }

        }
      }
      
  
                     
    // post: appends the given value to the end of the list
    public void add(int value) {
        if (front == null) {
            front = new ListNode(value);
        } else {
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }

    // pre: 0 <= index <= size()
    // post: inserts the given value at the given index
    public void add(int index, int value) {
        if (index == 0) {
            front = new ListNode(value, front);
        } else {
            ListNode current = nodeAt(index - 1);
            current.next = new ListNode(value, current.next);
        }
    }

    // pre : 0 <= index < size()
    // post: removes value at the given index
    public void remove(int index) {
        if (index == 0) {
            front = front.next;
        } else {
            ListNode current = nodeAt(index - 1);
            current.next = current.next.next;
        }
    }

    // pre : 0 <= i < size()
    // post: returns a reference to the node at the given index
    private ListNode nodeAt(int index) {
        ListNode current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
}
