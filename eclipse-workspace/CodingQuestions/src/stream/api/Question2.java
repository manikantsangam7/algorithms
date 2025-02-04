package stream.api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Question2 {

	public static void main(String[] args) {
		// from a list of integers find out the numbers starting with 1
		
		List<Integer> list = Arrays.asList(1, 2, 11, 2, 3, 12, 14, 3, 1344, 78);
		list.stream().map(e -> e + "").filter(e -> e.startsWith("1")).forEach(System.out::println);

		//find duplicate elements in a given integer list
		Set<Integer> set=new HashSet<Integer>();
		System.out.println("duplicate elements in the list :");
		list.stream().filter(e-> !set.add(e)).forEach(System.out::println);
		
		//print first element of the list
		System.out.println("First element of the list:");
		list.stream().findFirst().ifPresent(System.out::println);
		
		//total no. of elements present in the list
		long count=list.stream().count();
		System.out.println("Total no. of elements present in the list:"+count);
		
		//find maximum value present in list
		long max=list.stream().max(Integer::compare).get();
		System.out.println("Maximum value in the list is :"+max);
		
		//remove duplicate elements from the list
		System.out.println("List without duplicate elements:" + list.stream().distinct().collect(Collectors.toList()));
	}

}
