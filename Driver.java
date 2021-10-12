package org.howard.edu.lsp.assignment3.test;

import org.howard.edu.lsp.assignment3.implementation.IntegerSet;
import org.howard.edu.lsp.assignment3.implementation.IntegerSetException;

public class Driver {

	   public static void main(String[] args) throws IntegerSetException {
	      
	       IntegerSet set1 = new IntegerSet();
	       
	       System.out.println("Set before adding 2: "+set1);
	       
	       set1.add(2);
	       
	       
	       System.out.println("Set after adding 2: "+set1);
	       
	       System.out.println("Set before adding 5: "+set1);
	       
	       set1.add(5);
	       
	       
	       System.out.println("Set after adding 5: "+set1);
	       
	       System.out.println("Set before adding 1: "+set1);
	       
	       set1.add(1);
	       
	       System.out.println("Set after adding 1: "+set1);
	       
	       System.out.println("Set before adding 2: "+set1);
	       
	       set1.add(2);
	       
	       
	       System.out.println("Set after adding 2: "+set1);
	       
	       System.out.println("Set before removing 2: "+set1);
	       
	       set1.remove(2);
	       
	       
	       System.out.println("Set after removing 2: "+set1);
	       
	       System.out.println("Set before removing 10: "+set1);
	       
	       set1.remove(10);
	       
	       
	       System.out.println("Set after removing 10: "+set1);
	       
	       System.out.println("Largest elemnt in set :"+set1.largest());
	       
	       System.out.println("Smallest elemnt in set :"+set1.smallest());
	       
	       IntegerSet set2 = new IntegerSet();
	       
	       set2.add(7);
	       
	       
	       System.out.println("Set before doing union with: "+set2+" is: "+set1);
	       
	       set1.union(set2);
	       
	       System.out.println("Set after doing union with: "+set2+" is: "+set1);
	      
	       IntegerSet set3 = new IntegerSet();
	       
	       set3.add(7);
	       
	       set3.add(1);
	       
	       set3.add(10);
	       
	       System.out.println("Set before doing intersection with: "+set3+" is: "+set1);
	       set1.intersect(set3);
	       
	       
	       System.out.println("Set after doing intersection with: "+set3+" is: "+set1);
	      
	       IntegerSet set4 = new IntegerSet();
	       
	       
	       set4.add(7);
	       
	       
	       System.out.println("Set before doing difference with: "+set4+" is: "+set1);
	       set1.diff(set4);
	       
	       
	       System.out.println("Set after doing difference with: "+set4+" is: "+set1);
	   }
	  
	}