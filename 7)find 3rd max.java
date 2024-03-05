
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();
        
        int[] a = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            a[i] = in.nextInt();
        }
        
        // Sort the array in ascending order
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        
        // Check if the first, second, and third largest numbers are the same
        if (a.length >= 3 && a[a.length - 1] == a[a.length - 2] && a[a.length - 2] == a[a.length - 3]) {
            System.out.println("No");
        } else {
            // Print the third largest element
            System.out.println("Third largest element: " + a[a.length - 3]);
        }
    }
}
