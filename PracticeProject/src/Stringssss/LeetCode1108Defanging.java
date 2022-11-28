package Stringssss;
//1108. Defanging an IP Address
//https://leetcode.com/problems/defanging-an-ip-address/
//Given a valid (IPv4) IP address, return a defanged version of that IP address.

//A defanged IP address replaces every period "." with "[.]".
public class LeetCode1108Defanging {

	public static void main(String[] args) {
String address = "1.1.1.1";
System.out.println(defangIPaddr(address));

	}
	 static String defangIPaddr(String address) {
	        return address.replace(".", "[.]");
	    }
}
