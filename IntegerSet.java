package org.howard.edu.lsp.assignment3.implementation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** 
 * 
 * @author stephaniepercy
 * google used for resources and information
 *
 */


// will implement the list interface 

public class IntegerSet {
  
   // use an array list, which is a resizable array
   private List<Integer> set = new ArrayList<Integer>();
  
   // ArrayList as the set implementation
   
   // Default Constructor
   public IntegerSet() {
   }
  
   // Clears the internal representation of the set
   public void clear() {
       set.clear();
   }
  
   // Returns the length of the set
   public int length() {
       return set.size(); // returns the length
   }
  
   //returns the element that is present at a particular index in IntegerSet
   public int get(int index) {
       return set.get(index);
   }
   /*
   * Returns true if the 2 sets are equal, false otherwise;
   * Two sets are equal if they contain all of the same values in ANY order.
   */
   public boolean equals(IntegerSet b) {
       //return false if lengths of two sets are not equal
       if(b.length() != this.length()) {
    	   
           return false;
       }
      
       //check if all the elements in set b are contained in this set or not
       for(int i = 0; i < b.length(); i++) {
    	   
           if(!this.contains(b.get(i))) {
        	   
               return false;
           }
       }
      
       return true;
   }
  
   // Returns true if the set contains the value, otherwise false
   public boolean contains(int value) {
	   
       return set.contains(value);
   }
  
   // Returns the largest item in the set; Throws a IntegerSetException if the set is empty
   public int largest() throws IntegerSetException {
	   
       if(this.isEmpty()) {
    	   
    	   //  create a throw a user defined exception
    	   
           throw new IntegerSetException();
       }
       int largest = this.get(0);
       
       for(int i=1;i<this.length();i++) {
    	   
    	   // using a for loop to iterate through
    	   
           if(this.get(i) > largest) {
        	   
               largest = this.get(i);
           }
       }
       return largest;
   }
   // Returns the smallest item in the set
   
   // Throws a IntegerSetException if the set is empty
   public int smallest() throws IntegerSetException{
	   
       if(this.isEmpty()) {
    	   
           throw new IntegerSetException();
       }
       int smallest = this.get(0);
       
       for(int i=1;i<this.length();i++) {
    	   
    	// using a for loop to iterate through
    	   
           if(this.get(i) < smallest) {
        	   
               smallest = this.get(i);
           }
       }
       return smallest;
   }
  
   // Adds an item to the set or does nothing it already there
   public void add(int item) {
	   
       // adds item to s or does nothing if it is in set
       if(!this.contains(item)) {
    	   
           set.add(item);
       }
   }
  
   // Removes an item from the set or does nothing if not there
   public void remove(int item) throws IntegerSetException{
	   
       if(this.isEmpty()) {
    	   
           throw new IntegerSetException();
       }
       //iterate over the set elements and remove the element if equals to item
       for(int i = 0; i<this.length(); i++) {
    	   
           if(this.get(i) == item) {
        	   
               set.remove(i);
               
               break;
           }
       }
   }
  
   // Set union
   public void union(IntegerSet intSetx) {
	   
       //add all the elements from intSetx to this set
       for(int i = 0; i < intSetx.length(); i++) {
    	   
           this.add(intSetx.get(i));
       }
   }
   // Set intersection
   public void intersect(IntegerSet intSetx) {
       //iterate over all the elements of this set and remove them if it is not present in intSetx
       Iterator<Integer> i = set.iterator();
       
       while(i.hasNext()) {
    	   
           if(!intSetx.contains(i.next())){
        	   
               i.remove();
           }
       }
   }
   // Set difference, s1 –s2
   public void diff(IntegerSet intSetx) {
	   
       // set difference, s1 - s2
	   
       //iterate over all the elements of this set
	   
	   //remove them if it is not present in intSetx
       Iterator<Integer> i = set.iterator();
       
       while(i.hasNext()) {
    	   // while loop used to iterate through set 
           if(intSetx.contains(i.next())){
        	   
               i.remove();
           }
       }
   }
  
   // Returns true if the set is empty, false otherwise
   boolean isEmpty() {
	   
       return set.isEmpty();
   }
  
   // Return String representation of your set
   public String toString() {
       // return String representation of your set
       if(this.isEmpty()) {
    	   
           return "[]";
       }
      
       String str = "[" + set.get(0);
       
       for(int i = 1; i < this.length(); i++) {
    	   
           str = str + "," + this.get(i);
       }
       str = str + "]";
       
       return str;
   }
}