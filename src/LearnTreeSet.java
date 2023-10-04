import java.util.*;
public class LearnTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Q1. Add the following elements:“Happy”, “New”, “Year”, “2021”.
		Set<String> mySet = new TreeSet<String>();
		mySet.add("Happy");
		mySet.add("New");
		mySet.add("Year");
		mySet.add("Happy");
		
		// Q2. Create an iterator of the HashSet.
		Iterator <String> iter = mySet.iterator();
		
		while(iter.hasNext()) {
			
			System.out.println(iter.next());
			
		}

	}

}
