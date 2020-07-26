package Group_id.Java8;

import java.util.function.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Palindrome_strings
{
    public static boolean isPalindrome(String str)
	{
		int cur_start = 0, cur_end = str.length() - 1; 
		  
        while (cur_start < cur_end)
        { 
            if (str.charAt(cur_start) != str.charAt(cur_end)) 
                return false; 
            cur_start++; 
            cur_end--; 
        } 
		return true;
	}
	public static void main(String args[])
	{
		List<String> arr_strings=new ArrayList<String>(Arrays.asList("madam","123321","Hello","abcd","Hi","acre","lkl","Acre"));
		Predicate<String> is_Palindrome_check = str -> (isPalindrome(str));
		ArrayList<String> desired_strings=get_desired_strings(arr_strings,is_Palindrome_check);
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
