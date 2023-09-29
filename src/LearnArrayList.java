import java.util.*;
public class LearnArrayList {

	public static void main(String[] args) {
		
		ArrayList <Integer> list = new ArrayList<Integer>();
		
		//Q1. Add numbers 1 to 5 using a loop.
		for (int i = 1; i < 6; i++) {
			
			list.add(i);
		}
		
		//Q2. Print elements of the ArrayList.
		System.out.println(list);
		
		//Q3. Remove the 4th element of the ArrayList.
		list.remove(3);
		
		//Q4. Print all elements of the ArrayList.
		System.out.println(list);
		
		//Q5. Print elements of the ArrayList one by one.
		for (int num : list) {
			
			System.out.println(num);
			
			
		}
		

	}
	
	

}
