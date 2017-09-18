/**
 * Assignment2.java
 */
package it391.Sieglaff.Unit4;

/**
 * @author John Sieglaff
 * Class for assignment 2 of unit 4
 */
public class Assignment2 {
	/**
	 * Main entry point for the program
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] studentGrades = {65, 95, 75, 55, 56, 90, 98, 88, 97, 78};
		int[] tempArray = studentGrades;
		
		sortArrayDes(studentGrades);
		sortArrayAsc(tempArray);
	}// end main

	private static void sortArrayAsc(int[] grades) {
		int n = grades.length;
		int temp = 0;
		
		for(int i=0;i<n;i++) {
			for(int j = 1; j<(n-i);j++) {
				if(grades[j-1] > grades[j]) {
					temp = grades[j-1];
					grades[j-1]=grades[j];
					grades[j]=temp;
				}//end if statement
			}//end inner for loop
		}//end outer for loop
		printArray("Bubble Sort Ascending.", grades);
	}

	private static void printArray(String heading, int[] grades) {
		System.out.println(heading);
		
		for(int grade:grades)
			System.out.printf("%d ", grade);
		
		System.out.println();
	}

	private static void sortArrayDes(int[] grades) {
		int n = grades.length;
		int temp = 0;
		
		for(int i=0;i<n;i++) {
			for(int j = 1; j<(n-i);j++) {
				if(grades[j-1] < grades[j]) {
					temp = grades[j-1];
					grades[j-1]=grades[j];
					grades[j]=temp;
				}//end if statement
			}//end inner for loop
		}//end outer for loop
		printArray("Bubble Sort Descending.", grades);
	}
	
	

}// end class Assignment2
