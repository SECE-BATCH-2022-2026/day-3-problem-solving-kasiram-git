// Pattern Match Checker
// Pattern: [Any letter or digit] R [digit] [Any letter or digit]
// Day 4 -- Problem1

// Reference: https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html


import java.util.*;
import java.util.regex.*;

class paternChecker{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String ip = sc.nextLine();
		System.out.println(UserMainCode.regularExpression(ip));
	}
}
class UserMainCode {
	public static boolean regularExpression(String ip){
		Pattern p = Pattern.conpile("[a-zA-Z0-9][R][0-9][a-zA-Z0-9]");
		Matcher m = p.matcher(ip);
		return m.matches();
		//return ip.matches("[a-zA-Z0-9][R][0-9][a-zA-Z0-9]");
	}
}