package com.yedam.collections.tree;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Fruits {
	String name;
	int price;
	public Fruits(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
}
class ComparatorClass implements Comparator<Fruits> {
	@Override
	public int compare(Fruits o1, Fruits o2) {
		if(o1.price > o2.price)
			return  1;
		else if (o1.price == o2.price)
			return 0;
		else 
			return -1;
	}
	
}

public class CoparatorExample {
	public static void main(String[] args) {
		TreeSet<Fruits> tSet = new TreeSet<>(new ComparatorClass());
		tSet.add(new Fruits("aaa", 30));
		tSet.add(new Fruits("bbbb", 25));
		tSet.add(new Fruits("cc", 35));
		tSet.add(new Fruits("ddddd", 50));
		
		Iterator<Fruits> iter = tSet.iterator();
		while(iter.hasNext()) {
			Fruits per = iter.next();
			System.out.println(per.name + " , " + per.price);
//			System.out.println(iter.next().name + " , " + iter.next().age);
		}
	}
}
