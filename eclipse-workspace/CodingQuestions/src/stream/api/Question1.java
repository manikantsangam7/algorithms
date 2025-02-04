package stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question1 {

	public static void main(String[] args) {
		// Given a list of integers, find all even no's

		List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		list.stream().filter(l->l%2==0).forEach(System.out::println);
		
		//separate odd and even numbers
		Map<Boolean, List<Integer>> mp=list.stream().collect(Collectors.partitioningBy(l->l%2==0));
		System.out.println(mp);
		
	}

}
