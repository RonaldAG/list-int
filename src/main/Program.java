package main;

import list.ListInt;

public class Program {

	public static void main(String[] args) {
		ListInt listInt = new ListInt();
		
		listInt.add(1);
		listInt.add(2);
		listInt.add(3);
		listInt.add(4);
		
		System.out.println(listInt.toString());
//		System.out.println("Tamanho da lista: " + listInt.size());
//		listInt.remove(4);
//		System.out.println(listInt.toString());
//		System.out.println(listInt.get(5));
		
		listInt.insert(1, 6);
		System.out.println(listInt.toString());
		System.out.println(listInt.contains(10));
	}
}
