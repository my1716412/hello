package com.yedam.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("홍길동", 80);
		map.put("이길동", 70);
		map.put("김길동", 60);
		map.put("홍길동", 50);
		System.out.println("Entry갯수: " + map.size());
		System.out.println("방법I"); //key를 set에 담아서 iterator로 가져옴.
		Set<String> keyset = map.keySet();
		Iterator<String> iter = keyset.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println("key: " + key + ", value: " + map.get(key));
		}

		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> mapIter = entrySet.iterator();
		while(mapIter.hasNext()) {
			Map.Entry<String, Integer> ent = mapIter.next();
			System.out.println("key: " + ent.getKey() + ", value: " + ent.getValue());
		}
		
		for(Map.Entry<String, Integer> mapEnt : entrySet) {
			System.out.println(mapEnt.getKey() + "," + mapEnt.getValue());
		}
		//		for(Entry<String,Integer> ent : map) {
//			System.out.println();
//		}
	}
}
