package Maven;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		
		int[] numbersList = {1,2,3,4,1,2,3,5,6,7,6,8,9,0,8,0};
		
		System.out.println("DUplicate numbers in the list are " );
		
		Arrays.sort(numbersList);
		
		for (int i=0;i<numbersList.length;i++) {
			for (int j=i+1;j<numbersList.length;j++) {
				if (numbersList[i] == numbersList[j]) {
					System.out.println(numbersList[j]);
					break;
					}
			}
		}
	}
}
