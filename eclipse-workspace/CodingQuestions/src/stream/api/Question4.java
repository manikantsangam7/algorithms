package stream.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question4 {

	public static void main(String[] args) {
		
		List<Map<String, Integer>> listOfMap = new ArrayList<>();
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("key1",4);
		 
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("key1",3);
		 
		Map<String, Integer> map3 = new HashMap<>();
		map3.put("key1",1);
		 
		Map<String, Integer> map4 = new HashMap<>();
		map4.put("key1",2);
		
		 
		listOfMap.add(map1);
		listOfMap.add(map2);
		listOfMap.add(map3);
		listOfMap.add(map4);
		
		listOfMap.stream().flatMap(e-> e.entrySet().stream()).sorted().collect(Collectors.toList());
		
		//List<Map<String, Integer>> sortedListOfMap = listOfMap.stream() .flatMap(map -> map.entrySet().stream()).sorted(Map.Entry.comparingByValue()) .map(entry -> Collections.singletonMap(entry.getKey(), entry.getValue())) .collect(Collectors.toList());
		

	}

}
