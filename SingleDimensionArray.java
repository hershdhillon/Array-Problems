package array;
public class SingleDimensionArray {
    int arr[] = null;
    
    //Constructor
    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
            
        }
    }

    // Print the Array
    public void traverseArray() {
        try {
            for (int i = 0; i < arr.length ; i++) {
                System.out.print(arr[i] + " ");
            }
        } catch (Exception e) {
            System.out.println("Array no longer exists!");
        }
    }
    
    //Insert Value in the Array
    public void insert(int location, int valueToBeInserted){
        try{
            if (arr[location] == Integer.MIN_VALUE){
                arr[location] = valueToBeInserted;
                System.out.println("Successfully inserted " + valueToBeInserted + " at location: " + location);
            } else {
                System.out.println("This cell is already occupied by another value.");
            }
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array!");
            //e.printStackTrace();
        }
    }
	
	//Access a particular element of an array
	public void accessingCell(int cellNumber) {
		try{
			System.out.println(arr[cellNumber]);
		} catch (ArrayIndexOutOfBoundsException e){
		System.out.println("Invalid index to access array !");
		}
	}
}//End of Class