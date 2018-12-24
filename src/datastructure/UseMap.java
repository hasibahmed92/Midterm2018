package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();


		hmap.put(12, "Roony");
		hmap.put(11, "Neymar");
		hmap.put(9, "Messi");
		hmap.put(7, "Ronaldo");
		hmap.put(10, "Ronaldinho");


		String var = hmap.get(12);
		System.out.println("Number 12 is from: " + var);
		String var1 = hmap.get(9);
		System.out.println("Number 9 is from: " + var1);


		Map<String, List<String>> list = new HashMap<String, List<String>>();
		List<String> city = new ArrayList<String>();
		city.add("England");
		city.add("Bangladesh");
		city.add("Argentina");
		list.put("City", city);
		System.out.println(list);

		List<String> country = new ArrayList<String>();
		country.add("Rio");
		country.add("USA");
		country.add("Brazil");
		list.put("Country ", country);
		System.out.println(list);

		for (Object str : list.keySet()) {
			System.out.println("KeySet:" + str);
			for (String str1 : list.get(str)) {
				System.out.println("Value: " + str1);
			}
		}

		Iterator itr = list.entrySet().iterator();
		System.out.println("List when using While Loop:");
		Iterator iterator = list.keySet().iterator();
		while (iterator.hasNext()) {
			Object values = iterator.next();
			for (String str1 : list.get(values)) {
				System.out.println("Value: " + str1);
			}
		}
	}

}