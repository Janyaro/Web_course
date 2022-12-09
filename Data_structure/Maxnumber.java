package Data_structure;

import java.util.Scanner;

public class Maxnumber {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length of the array");
    int length = sc.nextInt();
    int [] arr= new int [length];
    for (int j : arr) {
        System.out.println("Enter numbers ");
        arr[j]=sc.nextInt();
    }
    
    System.out.println("The maximum  number in the Array is :");
    int max=arr[0];
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]>max)
            max=arr[i];
            
        }
        System.out.println(max);
        return; 
            
    }
}