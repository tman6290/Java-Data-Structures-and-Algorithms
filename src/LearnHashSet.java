import java.util.*;
public class LearnHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set <String> mySet = new HashSet<String>();
		mySet.add("Happy");
		mySet.add("New");
		mySet.add("Year");
		mySet.add("2021");
		Iterator<String> iter = mySet.iterator();
		while (iter.hasNext()) {
			
			System.out.println(iter.next());
		}
		

	}

}
