
               Scanner in = new Scanner(System.in);
           
           //System.out.print("Enter the size of the array: ");
           int size = in.nextInt();
           
           int[] a = new int[size];
           
           //System.out.println("Enter the elements of the array:");
           for (int i = 0; i < size; i++) {
               a[i] = in.nextInt();
         }
        //int []a= {4,5,3,8,1};
        int b=a.length-1;
        
        
        
        
        int    z=(a.length/2);
        
        
        for(int i=z;i<a.length;i++) {
            if(i!=b && i<b) {
            int temp=a[i];
            a[i]=a[b];
            a[b]=temp;
            b--;
            }
        }
        for (int j=0;j<a.length;j++) {
            
            
                System.out.print(a[j] +" ");
                }
