/*
 * ==========================================
 * CS211, Spring 2020, 5/10
 * Vinh T. Nguyen
 * Homework 06 - Chap 16 EX 8 , 12
 * Exercise 8 - switch the orders of nodes in pairs
 * Exercise 12 - rearrage the negatives values before the non-negatives ones
 * the struggles of students in cs211
 * the little minions of LinkedIntList class that make things work
 * ==========================================
 */

// ListNode is a class for storing a single node of a linked
// list.  This node class is for a list of integer values.

public class ListNode {
    public int data;       // data stored in this node
    public ListNode next;  // link to next node in the list

    // post: constructs a node with given data and given link
    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    // post: constructs a node with given data and null link
    public ListNode(int data) {
        this(data, null);
    }

    // post: constructs a node with data 0 and null link
    public ListNode() {
        this(0, null);
    }
}
