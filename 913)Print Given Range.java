	Scanner in = new Scanner(System.in);
 //int []a= {4,5,3,7,6,9,1};  //remove scanner and line 5,6,8,9,10 and try with these three inputs
		//int b=2;
		//int c=5;
		 int size = in.nextInt();
		 int[] a = new int[size];
		 
		 for (int i = 0; i < size; i++) {
		           a[i] = in.nextInt();
		     }
		 
		 int b=in.nextInt();
		 int c=in.nextInt();
		for(int i=b;i<=c;i++) {
			System.out.print(a[i]+" ");
		}
