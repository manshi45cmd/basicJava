package sorting;
 
public class MergeSort {

    // divide function: recursively divides the array into smaller subarrays
    public static void divide(int arr[], int si, int ei) {
        // base case: if the subarray has only one element, return
        if (si >= ei) {
            return;
        }
        
        // calculate the midpoint of the subarray
        int mid = si + (ei - si) / 2;
        
        // recursively divide the left half of the subarray
        divide(arr, si, mid);
        
        // recursively divide the right half of the subarray
        divide(arr, mid + 1, ei);
        
        // merge the two sorted halves
        merge(arr, si, mid, ei);
    }

    // merge function: merges two sorted subarrays into a single sorted array
    public static void merge(int arr[], int si, int mid, int ei) {
        // create a temporary array to store the merged result
        int merged[] = new int[ei - si + 1];
        
        // initialize indices for the left and right halves
        int index = si;
        int index2 = mid + 1;
        int x = 0; // index for the merged array
        
        // merge smaller elements from both halves
        while (index <= mid && index2 <= ei) {
            if (arr[index] <= arr[index2]) {
                merged[x++] = arr[index++]; // take from left half
            } else {
                merged[x++] = arr[index2++]; // take from right half
            }
        }
        
        // copy any remaining elements from the left half
        while (index <= mid) {
            merged[x++] = arr[index++];
        }
        
        // copy any remaining elements from the right half
        while (index2 <= ei) {
            merged[x++] = arr[index2++];
        }
        
        // copy the merged result back into the original array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8}; // example array to be sorted
        
        // call the divide function to start the merge sort process
        divide(arr, 0, 5);
        
        // print the sorted array
        for (int jj : arr) {
            System.out.print(jj + " ");
        }
    }
}