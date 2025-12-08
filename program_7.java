import java.io.*;
class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Integer n=Integer.parseInt(br.readLine());
		String str[]=new String[n];
		for(int i=0;i<n;i++){
			str[i]=br.readLine();
		}
		Integer pick=Integer.parseInt(br.readLine());
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