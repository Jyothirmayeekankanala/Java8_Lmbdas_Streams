package Group_id.Java8;
import java.util.function.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Methods_class
{
	public static double average(List<Integer> list)
	{
		return list.stream().mapToInt(i->i).average().getAsDouble();
	}
}
public class Average_of_Integers
{
	public static void main(String args[])
	{
		List<Integer> arr=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
		Function<List<Integer>,Double> find_average=Methods_class::average;
		System.out.println("Average : "+find_average.apply(arr));
	}
}
