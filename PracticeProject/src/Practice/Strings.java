package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Strings {


	public static void main(String[] args) {
		//float a= 1234.4143f;
		//	System.out.printf("%.2f",a);
		//	System.out.println();
		//	System.out.printf("pie : %.3f",Math.PI); op= pie : 3.145
		//	int b=11;
		//	System.out.printf("HEllo %.2s and %.1s","kiran ",b); //op HEllo ki and 11
		//	System.out.println("assdds %n"+"E: "+Math.E);
		//	System.out.println("asdsa"+"%s"+"kiran");  //op asdsakiran

		//System.out.println(new ArrayList<>());


		//	String a=new String ("Kiran");
		//	String b=new String ("Kiran");
		//	System.out.println(a==b); //op false
		//	System.out.println(a.equals(b));//op true
		//	System.out.println(new Integer(33)+""+new ArrayList<>());  //op=33[]
		//	System.out.println("a"+"b");



		//**********performance************
		/*
		 * //String a=""; StringBuilder a=new StringBuilder(); for (int i = 0; i <26;
		 * i++) { char ch=(char)('A'+i); char ch1=(char)('a'+i);
		 * System.out.print(ch+" "); a.append(ch); // System.out.print(ch1+" ");
		 * 
		 * } System.out.println( a);
		 */


		/*** methods of String class*************/
String ip="10.10";
ip.replace(".", "[.]");
System.out.println(ip.replace(".", "[.]"));
		String name="kiran,jadhav";
		System.out.println(Arrays.toString(name.toCharArray()));
		System.out.println(name.length());
		System.out.println(name.toString());
		System.out.println(name.toLowerCase());//created a new object withot modifyng the original object
		System.out.println(name.toUpperCase());
		System.out.println(name.indexOf("i"));
		System.out.println(name.trim());
		System.out.println(Arrays.toString(name.split(",")));
		
		StringBuffer name1=new StringBuffer("kiran");
		String same2="jadhav";
		name1.append(same2);
		System.out.println(name1);
		
String a="is2 sentence4 This1 a3";
String[] arf=a.split(" ");
System.out.println(arf.length);

	}



}
/*
 * %c - Character 
 * %d - Decimal number (base 10) 
 * %e - Exponential floating-point * number
 *  %f - Floating-point number 
 *  %i - Integer (base 10) 
 *  %o - Octal number (base 8) 
 * %s - String
 *  %u - Unsigned decimal (integer) number 
 *  %x - Hexadecimal
 * number (base 16) 
 * %t - Date/time 
 * %n - Newline
 */