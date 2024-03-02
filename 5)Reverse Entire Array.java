      Scanner in = new Scanner(System.in); //input
	       
		   
	       int size = in.nextInt();//getting size of the array
	       
	       int[] a = new int[size];//creating new array with the input size
	       

	       for (int i = 0; i < size; i++) {
	           a[i] = in.nextInt();
	      }
	    //int []a= {1,2,3,4,5,6,7,8};
	    
	    for (int j=a.length-1;j>=0;j--) {
	    	System.out.print(a[j]+" "); 
	    
}
		
	}
