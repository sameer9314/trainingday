package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import com.bridgeLabz.Utility.Utility;

/******************************************************************************
*  Purpose: To implement a number chaining.
*   
*  @author  Sameer Saurabh
*  @version 1.0
*  @since   08-06-2018
*
******************************************************************************/
class HashFunction {
	static int slots = 11;
	public static void main(String[] args) throws IOException {
		Utility utility = new Utility();
		File f = new File("/home/administrator/eclipse-workspace/Funtional_Programs/numberSlotFile.txt");
		FileReader fr = null;
		int count = 0;
		MyLinkedList l = MyLinkedList.list();
		BufferedReader br = null;
		FileWriter fw = null;
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			String word = br.readLine();
			System.out.println(word);
			while ((word != null)) {
				String[] str = word.split(" ");
				for (int i = 0; i < str.length; i++) {
					count++;
					l.add((Integer.parseInt(str[i])));
				}
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Displaying List After getting values from file");
		l.display();
		System.out.println();
		Map<Integer, LinkedList<Integer>> map = new HashMap<Integer, LinkedList<Integer>>();
		LinkedList<Integer>[] List = new LinkedList[slots];

		int Value, SlotNumber;
		for (int i = 0; i < l.size(); i++) {
			Value = (Integer) l.get(i);
			SlotNumber = Value % 11;

			if (List[SlotNumber] == null) {
				List[SlotNumber] = new LinkedList<Integer>();
				map.put(SlotNumber, List[SlotNumber]);
			}
			List[SlotNumber].add(Value);
		}
		System.out.println("Map is:" + map);

		System.out.println("Enter the Number to search in the map");
		int number;
		number = utility.getInt();
		int key = number % 11;
		if (map.get(key).contains(number) == true) {
			map.get(key).remove(map.get(key).indexOf(number));
		}
		System.out.println("Number removed Successfully");
		FileWriter writer = new FileWriter(
				"/home/administrator/eclipse-workspace/Funtional_Programs/numberSlotFile.txt");
		for (int i = 0; i < map.size(); i++) {
			if (map.get(i) != null)
			writer.write(map.get(i) + " ");
			writer.flush();
		}
		writer.close();
		System.out.println("Final Map: " + map);
	}

}