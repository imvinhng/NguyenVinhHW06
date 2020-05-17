/*
 * ==========================================
 * CS211, Spring 2020, 5/10
 * Vinh T. Nguyen
 * Homework 06 - Chap 16 EX 8 , 12
 * Exercise 8 - switch the orders of nodes in pairs
 * Exercise 12 - rearrage the negatives values before the non-negatives ones
 * the struggles of students in cs211
 * interface IntList so that you know which methods to implement
 * ==========================================
 */

/* This is the interface definition for the IntList data type */
public interface IntList {    
public int size();    
public int get(int index);    
public String toString();    
public int indexOf(int value);    
public void add(int value);    
public void add(int index, int value);    
public void remove(int index);
}