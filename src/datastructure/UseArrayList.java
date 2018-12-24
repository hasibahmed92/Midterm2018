package datastructure;

import databases.ConnectToSqlDB;
import parser.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) throws Exception{
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */

		List <Integer>z = new ArrayList<>();

		z.add(1);
		z.add(2);
		z.add(3);
		z.add(4);
		z.add(5);
		z.add(6);

		System.out.println(z);
		System.out.println(z.get(0));
		System.out.println(z.remove(1));
		System.out.println(z);

		System.out.println("Use of for-each loop: ");
		for (Integer i: z) {
			System.out.println(i);
		}

		System.out.println("Use of iterator using while loop: ");
		Iterator it = z.iterator();
		while (it.hasNext()) {
			Integer i = (Integer) it.next();
			System.out.println(i);
		}
		List list=z;

		ConnectToSqlDB connectToSqlDB=new ConnectToSqlDB();

		connectToSqlDB.insertDataFromArrayListToSqlTable(list,"List", "Element");

		List<String> y = connectToSqlDB.readDataBase("List", "Element");
		for(String st:y){
			System.out.println(y);
		}


	}

}