package com.qa.iteration;

public class Runner {

	public static void main(String[] args) {
		
		boolean flag = true;
		int count = 0;
		
		while(flag == true) {
			System.out.println("Loop number: " + (count + 1));
			
			count++;
			
			if (count == 10) {
				flag = false;
			}
			
		}
		
		while(count < 10) {
			System.out.println("Loop number: " + (count + 1));
			
			count++;	
		}
		
		do {
			System.out.println("I will always loop at least once!");
		} while (flag);
		
//		counter; condition; increment/decrement
		for(int i = 0; i < 10; i++) {
			System.out.println("Loop number: " + (i + 1));
		}
		
//		continue - used for skipping a loop      break - used for forcing the loop to stop
		for(int i = 0; i < 10; i++) {
			
			if (i == 1) {
				continue; // skip a loop
			}
			
			if (i == 5) {
				break; // stops the loop
			}
			
			System.out.println("Loop number: " + (i + 1));
		}
		
//		Skip even values of i
		for(int i = 0; i < 20; i++) {
			
			if (i % 2 == 0) {
				continue; // skip a loop
			}

			System.out.println("The value of i is: " + i);
		}
		
	}
}
