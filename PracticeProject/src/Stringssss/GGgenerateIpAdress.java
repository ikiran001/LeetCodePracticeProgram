package Stringssss;

import java.util.ArrayList;

public class GGgenerateIpAdress {

	public static void main(String[] args) {
		String s="1111";
		System.out.println(genIp(s));

	}


	public static ArrayList<String> genIp(String s) {

		ArrayList<String> list=new ArrayList<>();
		if(s.length()<4){
			list.add("-1");
			return list;}

		else{  
			for(int i=0; i<s.length()-1;i++){
				list.add(s.charAt(0)+".");
			}

		}
		return list;
	}
}
