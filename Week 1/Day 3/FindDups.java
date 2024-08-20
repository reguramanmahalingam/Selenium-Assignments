package week1.day3;

import java.util.Arrays;

public class FindDups {
	public static void main(String [] arga) {
		int [] data= {2, 5, 7, 7, 5, 9, 2, 3};
		
		// Method 1
		for (int i = 0; i < data.length; i++) {
			
			for (int j = i+1; j < data.length; j++) {
				
				if (data[i]==data[j]) {
				
				System.out.println("The Duplicate value is :" +data[j]);
				}
			}
			
		}
		// Method 2
				Arrays.sort(data);
				for (int i = 0; i < data.length-1; i++) {
					
					if (data[i]==data[i+1]) {
						System.out.println(data[i+1]);
					}
					
					
				}
		
		}
	
		
			

}
