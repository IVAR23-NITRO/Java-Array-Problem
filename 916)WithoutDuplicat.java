  
        //int[] a = {1, 2, 2, 3, 4, 4, 5, 6, 6};
        //printArrayWithoutDuplicates(a);
         Scanner in = new Scanner(System.in);
             int size = in.nextInt();
             int[] a = new int[size];
             
             for (int i = 0; i < size; i++) {
                       a[i] = in.nextInt();
                 }
        printArrayWithoutDuplicates(a);
    }

    public static void printArrayWithoutDuplicates(int[] a) {
        Arrays.sort(a);

        int n = a.length;
        int j = 0;

        for (int i = 0; i < n-1; i++) {
            if (a[i] != a[i+1]) {
                a[j++] = a[i];
            }
        }
        a[j++] = a[n-1];

        for (int k = 0; k < j; k++) {
            System.out.print(a[k] + " ");
        }
