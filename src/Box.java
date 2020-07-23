
public class Box {
	
	int size = 0;
	
	public void printBox() {
		
		String row = "";
		
		// Create one row of stars
		for (int i=0; i < size; i++) {
			row = row + "*";
		}
		
		// Print the rows to size
		for (int i=0; i < size; i++) {
			System.out.println(row);
		}
	}
		
	public static void main(String[] args) {
		
		// Create new box
		Box test = new Box();
		
		// Change its size
		test.size = 5;
		
		// Run method
		test.printBox();
	}

}
