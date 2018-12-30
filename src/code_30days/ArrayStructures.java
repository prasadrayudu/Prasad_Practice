package code_30days;

public class ArrayStructures {

	private int theArray[] = new int[50]; // creates an array with the 50 indexes
	private int arraySize = 10;

	public void generateRandomArray() {

		for (int i = 0; i < arraySize; i++) {

			theArray[i] = (int) (Math.random() * 10) + 10;

		}
		/*
		 * public int[] getTheArray() { return theArray;
		 * 
		 * } public int setTheArray() { return arraySize;
		 */

	}

	public void printArray() {
		for (int i = 0; i < arraySize; i++) {

			System.out.println("--------");
			System.out.print("|" + i + "| ");
			System.out.println("|" + theArray[i] + "|");
		}

	}

	public int getValueAtIndex(int index) {
		if (index < arraySize)

			return theArray[index];

		return 0;
	}

	public boolean doesArrayContainsThisValue(int searchValue) {
		boolean valueInArray = false;
		for (int i = 0; i < arraySize; i++) {
			if (theArray[i] == searchValue) {
				valueInArray = true;
			}
		}
		return valueInArray;
	}

	// Delete Array row for the index and move elements up

	public void deleteIndex(int index) {

		if (index < arraySize) {

			// Overwrite the value for the supplied index
			// and then keep overwriting every index that follows
			// until you get to the last index in the array

			for (int i = index; i < (arraySize - 1); i++) {

				theArray[i] = theArray[i + 1];

			}

			arraySize--;

		}

	}

	public void insertValue(int value) {

		if (arraySize < 50) {

			theArray[arraySize] = value;

			arraySize++;

		}

	}

	// Linear Search : Every index must be looked at

	public String linearSearchForValue(int value) {

		boolean valueInArray = false;

		String indexsWithValue = "";

		System.out.print("The Value was Found in the Following Indexes: ");

		for (int i = 0; i < arraySize; i++) {

			if (theArray[i] == value) {
				valueInArray = true;

				System.out.print(i + " ");

				indexsWithValue += i + " ";
			}

		}

		if (!valueInArray) {
			indexsWithValue = "None";

			System.out.print(indexsWithValue);
		}

		System.out.println();

		return indexsWithValue;

	}

	public static void main(String args[]) {

		ArrayStructures newArray = new ArrayStructures();
		newArray.generateRandomArray();
		newArray.printArray();
		System.out.println(newArray.getValueAtIndex(8));
		System.out.println(newArray.doesArrayContainsThisValue(13));
		newArray.deleteIndex(4);
		newArray.printArray();
		newArray.insertValue(55);
		newArray.printArray();
		newArray.linearSearchForValue(10);

	}
}