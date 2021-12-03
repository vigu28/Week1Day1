package Maven;

import java.util.Arrays;

public class FindIntersection {
	
	public static void main(String[] args) {
		
		int [] list1 = {1,2,4,5,6,8,9};
		int [] list2 = {1,9,11,5,6,4,7};
		System.out.println("Common values in both the arrays are " );
		Arrays.sort(list1);
		Arrays.sort(list2);
		
		for (int i = 0; i< list1.length;i++) {
			for (int j = 0; j< list2.length;j++) {
				if (list1[i] == list2[j]) {
					System.out.println(list1[i]);
					break;
				}
				
			}
		}
	}

}
