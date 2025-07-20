public class Median {
    public static void main(String[] args) {
        
        int arr1[] = {1, 2}; // first array with two elements
        int arr2[] = {3, 4}; // second array with one element

        int mergedArr[] = new int[arr1.length + arr2.length]; // merged array of size 4

        for(int i = 0; i < arr1.length; i++) {
            mergedArr[i] = arr1[i]; // copying elements from arr1
        }   

        for(int i = 0; i < arr2.length; i++) {
            mergedArr[arr1.length + i] = arr2[i]; // copying elements from arr2
        }

        // Sorting the array in ascending order
        for(int i = 0; i < mergedArr.length; i++) {
            for(int j = i + 1; j < mergedArr.length; j++) {
                if(mergedArr[i] > mergedArr[j]) { // sorting in ascending order
                int temp = mergedArr[i];
                    mergedArr[i] = mergedArr[j];
                    mergedArr[j] = temp;
                }
            }
        }
        for(int i = 0; i < mergedArr.length; i++) {
            System.out.println(mergedArr[i]); // accessing each element using index
        }

        // Finding the median
        double median;
        int n = mergedArr.length;
        if(n % 2 == 0) {
            // If even, average of the two middle elements
            median = (mergedArr[n/2 - 1] + mergedArr[n/2]) / 2.0;
        } else {
            // If odd, middle element
            median = mergedArr[n/2];
        }
        System.out.println("Median: " + median); // printing the median 
    }
}
