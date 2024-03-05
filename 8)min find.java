	 Scanner in = new Scanner(System.in);
		//int []a= {1,3,1,3,3}; // used for sample checking before using scanner
		
		int size = in.nextInt();
	       
	       int[] a = new int[size];
	       
	       
	       for (int i = 0; i < size; i++) {
	           a[i] = in.nextInt();
	     }
	       int min=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}System.out.println(min);
