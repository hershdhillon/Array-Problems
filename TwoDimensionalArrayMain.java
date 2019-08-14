package array;

public class TwoDimensionalArrayMain {
    
    public static void main(String[] arg) {
        
        System.out.println("Creating a blank array of size 5X5..");
        TwoDimensionalArray sda = new TwoDimensionalArray(5,5);
        sda.traverseArray();
        
        sda.insertValueInTheArray(0,2,10001);
        sda.traverseArray();
        
        sda.accessSingleCell(0,2);
        sda.accessSingleCell(5,2);
        sda.accessSingleCell(2,2);
        
        sda.searchingSingleValue(10);
        sda.searchingSingleValue(2);
        
        sda.deleteThisArray();
        sda.traverseArray();
        
    }//End of Main Method
}//End of Class