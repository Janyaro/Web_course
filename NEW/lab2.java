package NEW;


import java.util.Arrays;
import java.util.Scanner;

public class lab2{
    
void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int si = sc.nextInt();
        int  [] arr = new int [si];

        for (int i = 0; i <si; i++) {
System.out.println("Enter "+(i+0)+"element");
            arr[i]=sc.nextInt();
                }
System.out.println(output(arr));
                sc.close();

            }
 String output(int [] Array) {
return Arrays.toString(Array);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size ");
        int size = sc.nextInt();
lab2 l = new lab2();
       l.input();
        System.out.println("The output is "+size);
sc.close();
    
    }
    
}