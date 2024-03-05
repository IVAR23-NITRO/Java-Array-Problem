	Scanner in=new Scanner(System.in);
	
	int a=in.nextInt();
	int sum=1;
	int i=1;
	
	while(sum<a*3) {
		System.out.print((sum=i*3)+" ");
		i++;
	}
