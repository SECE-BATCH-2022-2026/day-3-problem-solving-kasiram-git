// 2. PatternChecker2 
// Day 4 -- Problem2

import java.util.*;

class PatternChecker2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String ip = sc.nextLine();
		System.out.println(UserMainCode.regularExpression(ip));
	}
}

class UserMainCode {
	public static boolean regularExpression(String ip){
		
		/*Pattern p = Patten.conpile("[a-zA-Z0-9][R][0-9][a-zA-Z0-9]");
		Matcher m = p.matcher(ip);
		return m.matches();*/
		
		return ip.matches("(^[2][1-9]$)|(^[3][0-9]$)|(^[4][0-5]$)");
	}
}