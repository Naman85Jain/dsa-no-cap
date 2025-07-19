public class No_Duplicate {
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        int j = 0; // index for the next unique element
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != arr[j]) { // check if current element is different from the last unique element
                j++; // move to the next index for unique element
                arr[j] = arr[i]; // assign the current element to the next unique position
            }
        }
        for(int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " "); // print the unique elements
        }
    }
}
