            Scanner in = new Scanner(System.in);
         int size = in.nextInt();
         int[] a = new int[size];
         
         for (int i = 0; i < size; i++) {
                   a[i] = in.nextInt();
             }
        //int []a= {1,2,3,4,5,6,7};
        
        int b=a.length/2;
            //System.out.println(b);
        int i=0;
        int j=b-1;
        while(i!=j) {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        int m=b;
        int n=a.length-1;
        while(m!=n) {
            int temp=a[m];
            a[m]=a[n];
            a[n]=temp;
            m++;
            n--;
        }
        for(int k=0;k<a.length;k++) {
            System.out.print(a[k]+" ");
        }
