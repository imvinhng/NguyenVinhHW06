
/*
 * ==========================================
 * CS211, Spring 2020, 5/10
 * Vinh T. Nguyen
 * Homework 06 - Chap 16 EX 8 , 12
 * Exercise 8 - switch the orders of nodes in pairs
 * Exercise 12 - rearrage the negatives values before the non-negatives ones
 * the struggles of students in cs211
 * ==========================================
 */

public class ListClient {
    public static void main(String[] args) {
    
        LinkedIntList list = new LinkedIntList();
        list.add(-10);
        list.add(25);
        list.add(-31);
        list.add(47);
        list.add(-25);
        list.add(-68);
        list.add(77);
        System.out.println("Original List: "+list +"\n");
        
        //Exercise 8 - switch the orders of nodes in pairs
        list.switchPairs(); 
        System.out.println("Ex 8: "+list +"\n");
      
      //Exercise 12 - rearrage the negatives values before the non-negatives ones
      list.split(); 
      System.out.println("Ex 12: "+list +"\n");
     
 }


}
