// /* Java program for Merge Sort */
// class MergeSort 
// { 
//     // Merges two subarrays of arr[]. 
//     // First subarray is arr[l..m] 
//     // Second subarray is arr[m+1..r] 
//     void merge(int arr[], int l, int m, int r) 
//     { 
//     	System.out.println("Starting Merge function, l: " + l +"| m : " + m + "| r: " + r );
//         // Find sizes of two subarrays to be merged 
//         int n1 = m - l + 1; 
//         int n2 = r - m; 
  
//   		System.out.println("n1 : " + n1 + " |n2 : "+ n2);
//         /* Create temp arrays */
//         int L[] = new int [n1]; 
//         int R[] = new int [n2]; 
  
//         /*Copy data to temp arrays*/
//         for (int i=0; i<n1; ++i) 
//             L[i] = arr[l + i]; 
//         for (int j=0; j<n2; ++j) 
//             R[j] = arr[m + 1+ j]; 
  		
//   		System.out.print("L array");
//   		for (int k = 0 ; k<L.length ; k++){
//   			System.out.print(L[k] + ", ");
//   		}
//   		System.out.println("");
//   		System.out.print("R array");
//   		for (int k = 0 ; k<R.length ; k++){
//   			System.out.print(R[k] + ", ");
//   		}
  
//         /* Merge the temp arrays */
  
//         // Initial indexes of first and second subarrays 
//         int i = 0, j = 0; 
  
//         // Initial index of merged subarry array 
//         int k = l; 
//         while (i < n1 && j < n2) 
//         { 
//             if (L[i] <= R[j]) 
//             { 
//                 arr[k] = L[i]; 
//                 i++; 
//             } 
//             else
//             { 
//                 arr[k] = R[j]; 
//                 j++; 
//             } 
//             k++; 
//         } 
  
//          Copy remaining elements of L[] if any 
//         while (i < n1) 
//         { 
//             arr[k] = L[i]; 
//             i++; 
//             k++; 
//         } 
  
//         /* Copy remaining elements of R[] if any */
//         while (j < n2) 
//         { 
//             arr[k] = R[j]; 
//             j++; 
//             k++; 
//         } 
//   		System.out.println("merged array");
//   		for (int t = 0 ; t<arr.length ; t++){
//   			System.out.print(arr[t] + ", ");
//   		}
//   		System.out.println("");
//     } 
  
//     // Main function that sorts arr[l..r] using 
//     // merge() 
//     void sort(int arr[], int l, int r) 
//     { 
//         if (l < r) 
//         { 
//         	 System.out.println("Starting sort function, l: " + l + "| r: " + r );
//             // Find the middle point 
//             int m = (l+r)/2; 
  
//             // Sort first and second halves 
//             sort(arr, l, m); 
//             sort(arr , m+1, r); 
  
//             // Merge the sorted halves 
//             merge(arr, l, m, r); 
//         } 
//     } 
  
//     /* A utility function to print array of size n */
//     static void printArray(int arr[]) 
//     { 
//         int n = arr.length; 
//         for (int i=0; i<n; ++i) 
//             System.out.print(arr[i] + " "); 
//         System.out.println(); 
//     } 
  
//     // Driver method 
//     public static void main(String args[]) 
//     { 
//         int arr[] = {12, 11, 13, 5, 6, 7}; 
  
//         System.out.println("Given Array"); 
//         printArray(arr); 
  
//         MergeSort ob = new MergeSort(); 
//         ob.sort(arr, 0, arr.length-1); 
  
//         System.out.println("\nSorted array"); 
//         printArray(arr); 
//     } 
// } 
/* This code is contributed by Rajat Mishra */


public class MergeSort{

	void mergeSort (int arr[], int f, int l){

		if(f < l){
			System.out.println("Starting sort function, f: " + f + "| l: " + l );
			int m = (f + l)/2;
			mergeSort(arr, f, m);
			mergeSort(arr, m+1, l);

			merge(arr, f, m , l);
		}
	}

	void merge (int arr[], int f, int m, int l){
		System.out.println("Starting Merge function, f: " + f +"| m : " + m + "| l: " + l );

		int n1 = m-f+1;
		int n2 = l-m;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i=0; i<n1 ; i++){
			L[i] = arr[f+i];
		}

		for (int j=0; j<n2; j++){
			R[j] = arr[m+1+j];
		}

		 System.out.print("L array");
  		for (int k = 0 ; k<L.length ; k++){
  			System.out.print(L[k] + ", ");
  		}
  		System.out.println("");
  		System.out.print("R array");
  		for (int k = 0 ; k<R.length ; k++){
  			System.out.print(R[k] + ", ");
  		}		

  		int i = 0;
  		int j = 0;
  		while ( i < n1 && j < n2){
  			if (L[i] < R[j]){
  				arr[f+i+j] = L[i];
  				i++;
  			}else{
  					arr[f+i+j] = R[j];
  					j++;
  				}
  		}

  		while (i<n1){
  			arr[f+i+j] = L[i];
  			i++;
  		}

  		while (j<n2){
  			arr[f+i+j] = R[j];
  			j++;
  		}

  		

  		System.out.println("");
  		System.out.print("merged array");
  		for (int k = 0 ; k<arr.length ; k++){
  			System.out.print(arr[k] + ", ");
  		}	

	}



	void printArray(int arr[]){
		int n = arr.length;
		for (int i = 0; i< n; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}



	public static void main (String[] args){
		MergeSort ob = new MergeSort();
		int arr[] = {32,13,16,7,52,90};
		ob.mergeSort(arr, 0, arr.length-1);
//		ob.printArray(arr);
	}
}