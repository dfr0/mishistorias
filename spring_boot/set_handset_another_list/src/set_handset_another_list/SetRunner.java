package set_handset_another_list;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		//this is a kind of list with features of the ArrayList and the LinkedList. with set you cannot add duplicates.
		Set<Integer> numbers = new HashSet<>();
		// The list not maintains a order.
		numbers.add(765432);
		numbers.add(21312);
		numbers.add(4341);
		numbers.add(43131);
		System.out.println(numbers);
		//The link hash set maintain the order, with set you cannot add duplicates.
		Set<Integer> numbers2 = new LinkedHashSet<>();
		numbers2.add(765432);
		numbers2.add(21312);
		numbers2.add(4341);
		numbers2.add(43131);
		numbers2.add(43131);
		System.out.println(numbers2);
		//this kind of list store numbers on right side mayors and leftside minors, searching for a photo
		//Cannot permit duplicates
		Set<Integer> numbers3 = new TreeSet<>();
		numbers3.add(123123);
		numbers3.add(23131);
		numbers3.add(11);
		numbers3.add(34256);
		numbers3.add(-12);
		numbers3.add(-12);
		System.out.println(numbers3);
		
		// Create a list with letters
		List<Character> characters = List.of('G','A','B','X','J','Z','H','Z');
	
		//Uniq it is perfect for alphabet
		// Set is used to uniq elements
		Set<Character> treeSet = new TreeSet<>(characters);
		System.out.println("TreeSet " + treeSet);
		//To NOT maintain the insertion order
		Set<Character> LinkedHashSet = new LinkedHashSet<>(characters);
		System.out.println("LinkedhasSet " + LinkedHashSet);
		//The most eficcient, if you dont worry about the order etc used this.
		Set<Character> HashSet = new HashSet<>(characters);
		System.out.println("hasSet " + HashSet);
		
		//TheeSet implements navigable set, sorte natural order and contains so many methods.
		TreeSet<Integer> numbers4 = new TreeSet<>(Set.of(65,54,34,99,12));
		
		numbers4.floor(40); //floor is inclusive.
		numbers4.lower(34);
		numbers4.ceiling(34);
		numbers4.higher(34);
		numbers4.subSet(20,false,80,false); //tells the numbers between that two specific numbers., the upper limit es exlusive.
		numbers4.subSet(20,true,80,true); //tells the numbers between that two specific numbers., the upper limit es exlusive.
		numbers4.subSet(20,80); //tells the numbers between that two specific numbers., the upper limit es exlusive.
		numbers4.headSet(80); //tells the numbers between that two specific numbers., the upper limit es exlusive.
		
	}

}
