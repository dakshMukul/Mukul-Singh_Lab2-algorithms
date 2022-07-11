package cpm.gl.Lab_Question_1;

import java.util.Scanner;

public class FindTargetTransections {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
        System.out.println("Enter the number of transection per day");
		int size = sc.nextInt();
		int[] transactionArray = new int[size];
		
		System.out.println("Enter the transection now");
		for(int index = 0; index<size; ) {
			int transaction = sc.nextInt();
			if(transaction>0) {
			transactionArray[index] = transaction;
			index++;
		  }
		}
		System.out.println("Enter the no of targets");
		int noOfTargets = sc.nextInt(); 
		printNumberOfTransactions(transactionArray, noOfTargets);
		sc.close();
	}
		private static void printNumberOfTransactions(int[] transactionArray,int noOfTargets){
		while(noOfTargets > 0) {
			int transactionCount = getNoOfTransactions(transactionArray, noOfTargets);
			noOfTargets--;
			if(transactionCount == -1) {
				System.out.println("Daily target is not achieved");
			}else {
			System.out.println("The number of transaction at which daily target is"
					+ " achieved is = "+ transactionCount);
			}
		}
	}

	private static int getNoOfTransactions(int[] transactionArray,int noOfTargets) {
		System.out.println("Enter the daily target =");
		int target = sc.nextInt();
		int transactionCount = 0;
		int sum = 0;
		do {
			sum = sum + transactionArray[transactionCount];
			transactionCount++;
		}while(sum	<= target && transactionCount<transactionArray.length);
		if(transactionCount >= transactionArray.length) {
			return -1;
		}
		return transactionCount;
		}
	

}
