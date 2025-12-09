// 1.Repeat Front string and number will be provided by user the program must print the first three characters of the string as n times and if the string length is less than 3 the string took as front and print n times. //eg. Mukesh Kumar B, 3 -> Muk Muk Muk

import java.util.*;

class repeatFront{
	public static void main(String args[]){
		Scanner scn= new Scanner(System.in);
		intn= scn.nextInt();
		scan.nextLine();
		String s= scn.nextLine();
		System.out.print(UserMainCode.repeatFront(n,s));
	}
}
class UserMainCode{
	public static String repeatFront(int n, String s){
		 StringBuilder result=new StringBuilder();
		 if(s.length()==0){
		   return result.toString();	
		 }
		 if(s.length()==1 || s.length()==2){
		 	for(int i=1; i<=n; i++){
		 		result.append(s);
		 	}
		 }
		 else{
		 	String add=s.charAt(0)+""+s.charAt(1)+""+s.charAt(2);
		 	for(int i=1;i<=n;i++)
		 	result.append(add);
		 }
		 return result.toString();
	}
}