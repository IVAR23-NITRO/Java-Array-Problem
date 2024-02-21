
    	

        //int a[] = {1,4,3,2,5};
        //int b[] = {3, 4, 2, 6, 1, 8, 1, 9};
        
        Scanner sc=new Scanner(System.in);  
       // System.out.print("Enter the number of elements you want to store: ");  
     
        int n=sc.nextInt(); 
        int[] a = new int[n];
        for(int i=0; i<n; i++)  
        {  
         
        a[i]=sc.nextInt();  
        }  
        //System.out.print("Enter the number of elements you want to store: ");  
        int m=sc.nextInt();  
        
          
        int[] b = new int[m]; 
        //System.out.println("Enter the elements of the array: ");  
         
        for(int i=0; i<m; i++)  
        {  
        //reading array elements from the user   
        b[i]=sc.nextInt();  
        }  
        int maxa = a[0];
        int maxb = b[0];

        // Find the maximum value in arrays a and b
        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxa) {
                maxa = a[i];
            }
        }

        for (int i = 0; i < b.length; i++) {
            if (b[i] > maxb) {
                maxb = b[i];
            }
        }

        // Determine the overall maximum value
        int max = Math.max(maxa, maxb);

        int[] B = new int[max + 1];

        // Count occurrences of elements in arrays a and b
        for (int i = 0; i < a.length; i++) {
            B[a[i]]++;
        }

        for (int i = 0; i < b.length; i++) {
            B[b[i]]++;
        }

        // Print pairs in ascending order based on the value and frequency
       
        for (int i = 1; i <= max; i++) {
            if (B[i] > 1) {
                int z =B[i]/2;
                System.out.println(i + " - " + z);
            }
        }
