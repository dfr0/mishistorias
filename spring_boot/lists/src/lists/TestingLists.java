package lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TestingLists {

	public static void main(String[] args) {
			//We have some kind of list, ArrayList, Collections, Vectors and LinkedLists
			//ArrayList and Vectors have a penalization when add and removed elements of the lists
			// Vector have a penalization when access to the elements becase have to access from top to botton for ech
		    // elements of the list.
		//a List can have a duplicates
		// in a list you cannot store primitives, you cant store string, int, float etc.. in the same list, is called auto box
		// it is a wrapper class
		// is you forced the type of list only can store this kind off stuff.
		//Vector is treath safe
		//In a linked list the element is linked with the next element, double linked list it is the same but also linked with the previous element.
		List<String> words = List.of("Apple","Banana","Cat"); //inmutable List
		List<String> wordsArrayList = new ArrayList<String>(words); //mutable array list
		wordsArrayList.add("Ontheend");
		wordsArrayList.add(2,"OnESpcificPosition");
		wordsArrayList.addAll(words); //added a complete list to a new list.
		wordsArrayList.set(3, "ChangeToIt"); //sustitude on the 6 posisiton with this string. 
		wordsArrayList.remove(2); //Remove element on position 2.
		wordsArrayList.remove("Apple"); //Remove element with value.
		//to remove of object that use wrapper clases
		numbers.remove(Integer.valueOf(101));
		
		//To iterate 
		for(int i = 0; i < words.size(); i++) {
			System.out.println(words.get(i));
		}
		// Best form to iterate
		for(String word:words) {
			System.out.println(word);
		}
		//Iterator form
		Iterator wordsIterator = words.iterator();
		//and access to that with while 
		while(wordsIterator.hasNext()) {
			System.out.println(wordsIterator.next());
		}
		
		//best form to remove element on the ends
		Iterator <String> iterator = words.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().endsWith("at")) {
				iterator.remove();
		}
		
		//If you need a logic it is better for loop
		for(String word:words) {
			if(word.endsWith("it"))
				System.out.println(word);
		}
		
		List<String> wordsVectorList = new Vector<String>(words); //Vector list
		List<String> wordsLinkedList = new LinkedList<String>(words); //LinkedList
		List<Integer> numbers = new List.of(123,456,789); //Inmutable
		List <Integer> numbers2 = new ArrayList<>(numbers); Mutable
		
		//Static method to sort
		Collections.sort(numbers2);
		
		
		//
		
	}

}
