import java.util.*;
public class LearnHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set <String> mySet = new HashSet<String>();
		// Q1. Add the following elements: "Happy", "New", "Year", "2021".
		mySet.add("Happy");
		mySet.add("New");
		mySet.add("Year");
		mySet.add("2021");
		
		// Q2. Create an iterator of the HashSet.
		Iterator<String> iter = mySet.iterator();
		
		// Q3. Print the elements of the HashSet one by one.
		while(iter.hasNext()) {
			
			System.out.println(iter.next());
		}
		
        
		// Q4. Print the elements of the HashSet one by one.
		Iterator<String> iter2 = mySet.iterator();
		while(iter2.hasNext()) {
			
			String element = iter2.next();
			System.out.println(element.hashCode());
		}
		
        
		
		
		

	}

}
