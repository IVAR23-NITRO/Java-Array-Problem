import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       
       //System.out.print("Enter the size of the array: ");
       int size = in.nextInt();
       
       int[] a = new int[size];
       
       //System.out.println("Enter the elements of the array:");
       for (int i = 0; i < size; i++) {
           a[i] = in.nextInt();
      }
    //int []a= {1,2,3,4,5,6,7,8};
    int b=a.length-1;
    int sum=0;
    
    int z=0;
    
    if(a.length%2==0) {
        z=a.length/2;
    }else {
        z=(a.length/2)+1;
    }
    
    for(int i=z;i<a.length;i++) {
        if(i!=b && i<b) {
        int temp=a[i];
        a[i]=a[b];
        a[b]=temp;
        b--;
        }
    }
    for (int j=0;j<a.length;j++) {
        if(j!=a.length-1) {
        
            System.out.print(a[j]+" ");
            }
        else {
                System.out.println(a[j]);
            }
    }
    
        
    for (int k=0;k<a.length;k++) {
        
        if(a[k]%2==0) {
            sum=sum+a[k];
            
        }
        
    }System.out.println(sum);

    }
}
