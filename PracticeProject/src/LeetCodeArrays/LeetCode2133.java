package LeetCodeArrays;

import java.util.HashMap;

public class LeetCode2133 {

	public static void main(String[] args) {
int[][] arr= {{15,7,18,11,19,10,14,16,8,2,3,6,5,1,17,12,9,4,13}
              ,{17,15,9,8,11,13,7,6,5,1,3,16,12,19,10,2,4,14,18},
               {19,14,12,10,8,9,17,16,4,3,13,18,1,5,7,11,2,15,6}};



System.out.println(checkValid(arr));
	}

	
	public static boolean checkValid(int[][] matrix) {
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0; i<matrix.length;i++){
			for(int j=0; j<matrix[i].length;j++){
				if(!map.containsKey(matrix[i][j])){
					map.put(matrix[i][j],1);
				}
				else{
					map.put(matrix[i][j],map.get(matrix[i][j])+1);
				}
			}
		}
		for(int key:map.keySet()){
			if(map.get(key)>matrix.length || map.get(key)<matrix.length){
				return false;
			}
		}
		return true;
	}

}
