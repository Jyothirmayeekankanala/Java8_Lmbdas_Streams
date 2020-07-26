package Group_id.Java8;

import java.util.function.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Strings_with_Given_Conditions
{
	public static void main(String args[])
	{
		List<String> arr_strings=new ArrayList<String>(Arrays.asList("Hello","abcd","Hi","acre","Acre","apple","eraser","care"));
		ArrayList<String> desired_strings=get_desired_strings(arr_strings,(String s)-> (s.length()==4 && s.charAt(0)=='a'));
		for(int i=0;i<desired_strings.size();i++)
			System.out.print(desired_strings.get(i)+" ");
	}
	public static ArrayList<String> get_desired_strings(List<String> list, Predicate<String> predicate_to_be_applied)
	{
		ArrayList<String> result_list=new ArrayList<String>();
		for (String str : list)
		{
			if(predicate_to_be_applied.test(str))
				result_list.add(str);
		}
		return result_list;
	}
}
