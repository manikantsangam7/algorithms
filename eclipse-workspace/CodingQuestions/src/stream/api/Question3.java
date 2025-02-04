package stream.api;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question3 {

	public static void main(String[] args) {
		//find the first non repeated character in the string
		String sentence = "My name is manikant sangam";
		Character ch = sentence.chars().mapToObj(e -> (char) e).map(Character::toLowerCase)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(m -> m.getValue() == 1L).map(e -> e.getKey()).findFirst().get();
		System.out.println("First Non repeated character is :"+ch);
		
		//frequency of each character in a string
		LinkedHashMap<Character,Long> freq=sentence.chars().mapToObj(e->(char)e)
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		System.out.println("Frequency of each character in the string is:"+freq);
		
		//concatenate two streams
		List<String> l1=Arrays.asList("1","mani","sangam");
		List<String> l2=Arrays.asList("2","manikant","hero");
		Stream<String> s1=Stream.concat(l1.stream(), l2.stream());
		System.out.println("Concatenation of two streams=");
		s1.map(m->m+"").forEach(System.out::println);
	}

}
