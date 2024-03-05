      //int[] a = {1, 2, 3, 4, 5, 6, 7};
	        Scanner in = new Scanner(System.in);  
			 int size = in.nextInt();
			 int[] a = new int[size];
			 
			 for (int i = 0; i < size; i++) {
			           a[i] = in.nextInt();
			     }

	        // Step 1: Sort the array in ascending order
	        Arrays.sort(a);

	        // Step 2: Create a new array of the same size
	        int[] result = new int[a.length];

	        // Step 3: Traverse the sorted array and place elements at the correct indices
	        int left = 0, right = a.length - 1;
	        for (int i = 0; i < a.length; i++) {
	            if (i % 2 == 0) { // Even index: place maximum element
	                result[i] = a[right];
	                right--;
	            } else { // Odd index: place minimum element
	                result[i] = a[left];
	                left++;
	            }
	        }

	        // Print the resulting array
	        for (int num : result) {
	            System.out.print(num + " ");
	        }
