import java.util.*;

public class LearnLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        LinkedList <Integer> list = new LinkedList<Integer>();
		
		    //Q1. Add numbers 1 to 5 using a loop.
		    for (int i = 1; i < 6; i++) {
			
			    list.add(i);
		    }
		
		    //Q2. Print elements of the LinkedList.
		    System.out.println(list);
		
		    //Q3. Remove the 4th element of the LinkedList.
		    list.remove(3);
		
		    //Q4. Print all elements of the LinkedList.
		    System.out.println(list);
		
		    //Q5. Print elements of the LinkedList one by one.
		    for (int num : list) {
			
			    System.out.println(num);
			    
		    }

	    }

}
