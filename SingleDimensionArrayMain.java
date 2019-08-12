package array;

public class SingleDimensionArrayMain{
    
    public static void main(String[] args) {
        System.out.println("Create a blank array of size 10...");
        SingleDimensionArray sda = new SingleDimensionArray(10);
        
        System.out.println("\nPrinting the Array...");
        sda.traverseArray();
        System.out.println();System.out.println();
        
        System.out.println("Inserting few values in the array...");
        sda.insert(0,0);
        sda.insert(1,10);
        sda.insert(2,20);
        sda.insert(3,30);
        sda.insert(4,40);
        sda.insert(5,50);
        sda.insert(6,50);
        sda.insert(7,50);
        sda.insert(8,50);
        sda.insert(9,50);
        System.out.println();System.out.println();

        
    }//end of Main Method
}//end of Class
