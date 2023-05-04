package Stringssss;

public class LeetCode2299 {

	public static void main(String[] args) {
		String a="aB!aa123a";
		System.out.println(strongPasswordCheckerII(a));
	}
	
	

	public static boolean strongPasswordCheckerII(String password) {
		if(password.length()>=8){
			for(int i=0;i<26;i++){
				char ch=(char)('a'+i);
				if(password.contains(String.valueOf(ch))){
					for(int l=0;l<26;l++){
						char c=(char)('A'+l);
						if(password.contains(String.valueOf(c))){
							if(password.contains(String.valueOf('!')) || password.contains(String.valueOf('@')) || 
									password.contains(String.valueOf('#')) || password.contains(String.valueOf('$')) || 
									password.contains(String.valueOf('%')) || password.contains(String.valueOf('^')) ||
									password.contains(String.valueOf('&')) || password.contains(String.valueOf('*'))||
									password.contains(String.valueOf('(')) || password.contains(String.valueOf(')')) ||
									password.contains(String.valueOf('-')) ||password.contains(String.valueOf('+'))) {
								int j=0;
								while(j<password.length()){
									int k=j+1;
									if(k<password.length() && password.charAt(j)==password.charAt(k)){
										return false;
									}
									else{
										j++;
									}
								}
								int k=0;
								while(k<10) {
									if(password.contains(k+"")) {
										return true;
									}
									else {k++;}
								}
								return false;
							}
						} 
					}
				}
			}
		}
		return false;
	}
}
