       
        Scanner in = new Scanner(System.in);
             int size = in.nextInt();
             int[] a = new int[size];
             
             for (int i = 0; i < size; i++) {
                       a[i] = in.nextInt();
                 }

        
     
        int maxNumber = Integer.MIN_VALUE;
        for (int num : a) {
            if (num > maxNumber) {
                maxNumber = num;
            }    
        }
        int[] b = new int[maxNumber + 1];
        for (int num : a) {
            b[num]++;
        }
        
      
        int maxFrequency = Integer.MIN_VALUE;
        for (int freq : b) {
            if (freq > maxFrequency) {
                maxFrequency = freq;
            }
        }
        
      
        for (int count = maxFrequency; count >= 1; count--) {
            for (int i = 0; i < b.length; i++) {
                if (b[i] == count) {
                    for (int j = 0; j < count; j++) {
                        System.out.print(i + " ");
                    }
                }
            }
        }
