// 3. Phone Number Validator
// Day 4 -- Problem3

import java.io.*;
import java.util.*;


class NumberValidator{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		String ip = scn.nextLine();
		System.out.println(UserMainCode.phoneValidator(ip));
	}
}

class UserMainCode {
	public static boolean phoneValidator (String inp){
		return inp.matches("[1-9]{2}[0-9]{8}");
	}
}