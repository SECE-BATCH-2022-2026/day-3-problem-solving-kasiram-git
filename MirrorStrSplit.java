// 3. Split Each word and Mirroring the word
// Day 4 -- Problem4

import java.io.*;
import java.util.*;

class MirrorStrSplit{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		String ip = scn.nextLine();
		char ch = scn.nextLine().charAt(0);

		String [] op = UserMainCode.splitString(ip,ch);
		Arrays.stream(op).forEach(str->System.out.println(str));
	}
}

class UserMainCode {
	public static String [] splitString (String ip,char ch){
		// String[] iparr = ip.split(Pattern.quote("" + ch)); //Safer when handling with special characters

		String [] iparr = ip.split(""+ch);
		String [] op = new String[iparr.length];
		int i=0;
		for(String s : iparr){
			/*StringBuilder sb = new StringBuilder(s);
			sb = sb.reverse();
			String s1 = sb.toString();
			op[i++] = s1.toLowerCase();*/
			op[i++] = new StringBuilder(s).reverse().toString().toLowerCase();
		}
		return op;
	}
}