// 2. Removes duplicates properly after sorting

import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner scn= new Scanner(System.in);
		int n= scn.nextInt();
		String arr[]= new String[n];
		scn.nextLine();

		for(int i=0 ;i<n; i++){
			arr[i]=scn.nextLine();
		}

		List<String> al= UserMainCode.removeDuplicate(arr);
		
		for(String s:al){
			System.out.print(s+" ");
		}
		
	}
}

class UserMainCode{
	public static List<String> removeDuplicate(String[] arr){
	Arrays.sort(arr);
       
	List<String> al=new ArrayList<>();
		for(String s:arr){
			if(!al.contains(s)){
				al.add(s);
			}
		}
		return al;
	}
}