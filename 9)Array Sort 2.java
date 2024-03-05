     Scanner in = new Scanner(System.in);
            //int []a= {1,3,1,3,3};
            
            int size = in.nextInt();
               
               int[] a = new int[size];
               
               
               for (int i = 0; i < size; i++) {
                   a[i] = in.nextInt();
             }
            for (int i=0;i<a.length;i++) {
                    
                for (int j=i+1;j<a.length;j++) {
                        if(a[i]>a[j]) {
                            int temp=a[i];
                            a[i]=a[j];
                            a[j]=temp;
                        
                            
                        }
                        }
                        
                        
                        
                    }
            for(int y=0;y<a.length;y++) {
                System.out.print(a[y]+" ");
            }
