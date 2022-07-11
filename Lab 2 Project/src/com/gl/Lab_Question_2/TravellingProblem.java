package com.gl.Lab_Question_2;

import java.util.Scanner;

public class TravellingProblem {
    private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number of currency denominations=");
		int noOfDenominations = sc.nextInt();
		System.out.println("Enter the currency denominations=");
		int[] denominationsArray = new int[noOfDenominations];
		for(int index= 0; index < noOfDenominations; index++) {
		
			int denomination = sc.nextInt();
			if(denomination!= 0) {
				denominationsArray[index] = denomination;
			  index++;
			}
		}
		MergeSort mergeSort = new MergeSort();
		mergeSort.mergeSort(denominationsArray,0,denominationsArray.length-1);
		for(int i = 0; i< denominationsArray.length;i++) {
			System.out.print(denominationsArray[i]);
			System.out.print(" , ");
		}
		System.out.println("Enter the target amount");
		int target = sc.nextInt();
		NotesCounter notesCounter = new NotesCounter();
		int notesCounterArray = notesCounter.notesCounter(denominationsArray, target);

	}

}
