// 1. Count the occurrence of the matching string from str2 to str1

import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	String s2=sc.nextLine();
	int count=UserMainCode.countOccurances(s1,s2);
	System.out.println(count);
	}
}


class UserMainCode {
    public static int countOccurances(String s1, String s2) {
        int count = 0;

        int len1 = s1.length();
        int len2 = s2.length();

        if(len1 == 0 || len2 == 0) return 0;

        for(int i = 0; i <= len1 - len2; i++) {
            // Check substring match
            int j;
            for(j = 0; j < len2; j++) {
                if(s1.charAt(i + j) != s2.charAt(j)) {
                    break;
                }
            }
            if(j == len2) {
                count++;
            }
        }

        return count;
    }
}
