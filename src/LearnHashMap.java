import java.util.*;
public class LearnHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Q1. Create a HashMap and store the following student data.
		Map <Integer, String> myMap = new HashMap <Integer, String>();
		myMap.put(202, "John");
		myMap.put(200, "Alex");
		myMap.put(201, "Anna");
		myMap.put(203, "Monika");
		myMap.put(204, "Alex");
		
		// Q2. Print the student names and their IDs on the console.
		System.out.println(myMap);
		//The map is printed out in ascending order of the keys.
		
		// Q3. Declare a HashMap with an 𝐼𝑛𝑡𝑒𝑔𝑒𝑟 key and 𝑆𝑡𝑟𝑖𝑛𝑔 value. Add the following data to the HashMap.
		Map <Integer, String> myMap2 = new HashMap <Integer, String>();
		myMap2.put(102, "Alex");
		myMap2.put(20, "Paul");
		myMap2.put(70, "James");
		myMap2.put(409, "Peter");
		myMap2.put(30, "Andy");
		
		Set <Integer> keySet = myMap2.keySet();
		
		// Q4. Create an iterator and display the elements of the HashMap on the console.
		for (int key : keySet) {
			
			System.out.println(key + ": " + myMap2.get(key));
			
		}
		
		// Q5. Get value for key 20 and 40. What do you observe in the output for a key of 40?
		System.out.println(myMap2.get(20));
		System.out.println(myMap2.get(40)); // Returns null because this key does not exist.
		
		// Q6. Remove the element with the key 30.
		myMap2.remove(30);
		
		System.out.println(myMap2);

	}

}
