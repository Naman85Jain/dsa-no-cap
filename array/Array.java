// array is a collection of similar kind of data items
// syntax - type[] arrayName
// arr gets created in heap memory
// reference variable arr gets created in stack memory
// traversing an array - accessing each element of the array
// we always use for loop to traverse an array - using the length property and index of the elements in array
// System.out.println(arr); prints the reference variable, not the elements

public class Array {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 30;    
        arr[2] = 20; 
        arr[3] = 40; 
        arr[4] = 50; 
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) { // sorting in ascending order
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); // accessing each element using index
        }
        // for(int i: arr) {
        //     System.out.println(i); // enhanced for loop to access each element
        // }   
    }
}
