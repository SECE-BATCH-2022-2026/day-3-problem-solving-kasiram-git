// 1. CPT code Validator
// Day3 -- Problem 1

// CPT-639212 -  Correct
// CPT-23947 -  Incorrect Code

import java.util.*;

class codeValidator{
	public static void main(String args[]){
		Scanner scn= new Scanner(System.in);
		String text= scn.nextLine();
		System.out.print(UserMainCode.matchPattern(text));
	}
}


// Refer
// https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html

class UserMainCode{
	public static boolean matchPattern(String text){
		return text.matches("CPT-\\d{6}");
	}
}