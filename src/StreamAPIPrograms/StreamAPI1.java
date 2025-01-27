package StreamAPIPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI1 {

	
	public static void main(String[] args) {
		//create List And filter even number.
		
	List<Integer>integer1=	List.of(2,4,9,5,6,8,12);
	System.out.println(integer1);
	List<Integer> integer2=Arrays.asList(23,67,8,12);
	 //without stream finding even
	
	
	
	List<Integer>integer3=integer1.stream().filter(n->n%2==0).collect(Collectors.toList());
	System.out.println(integer3);
	List<Integer>integer4=integer1.stream().filter(n->n>10).collect(Collectors.toList());
System.out.println(integer4);

String names[]= {"na","ta","vi"};

Arrays.stream(names).forEach(e->System.out.println(e));//one way
Stream.of(names).forEach(e->System.out.println(e));


	/*for(Integer i :integer1)
	{
		if(i%2==0)
			list3.add(i);
		
			
	}
	System.out.println(list3);
		
	}*/


	}

}
