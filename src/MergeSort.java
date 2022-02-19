
import java.util.Scanner;
public class MergeSort {

      
    void mergesort(int arr[], int a1, int b1, int c1)
    {
     
        int no1 = b1 - a1 + 1;
        int no2 = c1 - b1;  
        
        int L[] = new int[no1];
        int R[] = new int[no2];
  
        
        for (int i = 0; i < no1; ++i)
            L[i] = arr[a1 + i];
        for (int j = 0; j < no2; ++j)
            R[j] = arr[b1 + 1 + j]; 
         
        
        int i = 0, j = 0;
          
        int k = a1;
        while (i < no1 && j < no2) 
        {
            if (L[i] <= R[j]) 
            {
                arr[k] = L[i];
                i++;
            }
            else 
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
  
       
        while (i < no1) {
            arr[k] = L[i];
            i++;
            k++;
        }
  
        
        while (j < no2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
  
    
    void sort(int arr[], int a1, int c1)
    {
        if (a1 < c1) 
        {
            int m =a1+ (c1-a1)/2;
            sort(arr, a1, m);
            sort(arr, m + 1, c1);
            mergesort(arr, a1, m, c1);
        }
    }
  
    
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
  
    
    public static void main(String args[])
    {
        int n;  
        Scanner scan=new Scanner(System.in); 
        System.out.print("Enter array Size: ");  
        n=scan.nextInt();  
        int[] array = new int[n];   
        for(int i=0; i<n; i++)  
        {    
            array[i]=scan.nextInt();  
        }  
        MergeSort ob = new MergeSort();
        ob.sort(array, 0, array.length - 1);
  
        System.out.println("\nThe New Sorted array");
        printArray(array);
    }
}