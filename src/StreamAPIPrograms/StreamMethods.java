package StreamAPIPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {
	public static void main(String[] args) {
	List<Integer> list	=Arrays.asList(12,4,5,6,7);
	List<List<String>> nestedString=Arrays.asList(Arrays.asList("nayana","tanush"),Arrays.asList("vinay","tanush"));
	Stream stream=list.stream().map(e->e+5);
	stream.forEach(e->System.out.println(e));
	
	List<Integer> list1=list.stream().map(n->n-2).collect(Collectors.toList());
	System.out.println(list1);
	list.stream().map(n->n-2).collect(Collectors.toList());
	list.stream().map(n->n-2).forEach(System.out::println);
System.out.println("sorting starts");
	list.stream().sorted().forEach(System.out::println);
	System.out.println("Minimum number");
	Integer str=list.stream().min((x,y)->x.compareTo(y)).get();
	System.out.println(str);
	
	
int sum=list.stream().reduce(0,(n,n1)->n+n1);
System.out.println("sum"+sum);

boolean b=list.stream().allMatch(n->n==0);
System.out.println(b);
boolean b1=list.stream().equals(str);
System.out.println(b1);
List<String> flatlistt=nestedString.stream().flatMap(List::stream).collect(Collectors.toList())
;
System.out.println(flatlistt);}

}
