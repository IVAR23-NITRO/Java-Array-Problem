        Scanner in = new Scanner(System.in);
         int size = in.nextInt();
         int[] a = new int[size];
         
         for (int i = 0; i < size; i++) {
                   a[i] = in.nextInt();
             }
        //int []a= {1,2,3,4,5,-6};
        
          int sum=0;
        
        for(int i=0;i<a.length;i++) {
            if(a[i]>0) {
            sum=sum+a[i];
        }}System.out.println(sum);
