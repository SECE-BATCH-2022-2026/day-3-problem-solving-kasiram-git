//Reads n strings 
// Picks the pick-th character from each
// Builds a string from those characters
// Inserts "$" when the character does not exist
// Prints the final combined string

// Day3 -- Problem 2

import java.io.*;
class nthchar{
	public static void main(String args[]) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		Integer n= Integer.parseInt(br.readLine());
		String str[]= new String[n];
		for(int i=0; i<n; i++){
			str[i]=br.readLine();
		}
		Integer pick= Integer.parseInt(br.readLine());
		System.out.print(UserMainCode.nthChar(str,pick));
	}
}

class UserMainCode{
	public static String nthChar(String[] str,Integer pick){
		StringBuilder s=new StringBuilder();
		for(String val:str){
		   try{
		   	  s.append(val.charAt(pick-1));
		   }
		   catch(Exception e){
		   	  s.append("$");
		   }
		}
		return s.toString();
	}

}
