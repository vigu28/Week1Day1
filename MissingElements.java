package Maven;

import java.util.Arrays;

public class MissingElements {

	public static void main(String[] args) {
		
		int[] list = {1,2,3,7,6,8};
		
		Arrays.sort(list);
		
		for (int i=1;i<list.length;i++) {
			
			if (i!= list[i-1]) {
				System.out.println("Missing Number in the list " + i);
			}
		}
			
	}
}

