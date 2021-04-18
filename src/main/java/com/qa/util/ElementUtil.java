package com.qa.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ElementUtil {

	//Java program practice
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Guava");
        fruits.add("Pineapple");
        fruits.add("Apple");
  
        // printing contents of array list before conversion
        System.out.println("Elements in ArrayList are : "
                           + fruits);
  
        // creating new hashmap and using method reference
        // with necessary classes for the conversion
        HashMap<String, Integer> res = fruits.stream().collect(Collectors.toMap(
                Function.identity(), String::length,
                (e1, e2) -> e1, HashMap::new));
  
        // printing the elements of the hash map
        System.out.println("Elements in HashMap are : "
                           + res);
        
      //  HashMap<String,Integer>hashCol= fruits.stream().collect(Collectors.toMap(Function.identity(), String::length,(e1, e2) -> e1, HashMap::new));

	}
}
