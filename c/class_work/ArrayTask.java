package c.class_work;

import java.util.Arrays;
import java.util.Scanner;

class Array{
    int row;
    int col; 
    int comb = row*col; 
    static Scanner sc = new Scanner(System.in);
    
    Array(int row,int col){
        this.row=row;
        this.col=col;
    }
    public void insert (int Number[][], int row ,int col) {
     

        for (int i = 0; i < row; i++) {
            System.out.println("Enter "+(i+1)+" Element ");
            for (int j = 0; j < col; j++) {
                Number[i][j] =sc.nextInt(); 
            }
        }

    }
    public void conver(int [][] arr , int [] a){
        comb= 0;
        for(int k = 0;k<row;k++){
            for(int l=0;l<col;l++){
                a[comb]=arr[k][l];
                comb++;
            }
        }
       
        Arrays.sort(a);
        System.out.println("The 1D array will be ");
        for (int i = 0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
    }
 public void search(int [] a , int target) {
    int count=0;
    for (int i = 0; i < a.length; i++) {

        if(a[i]==target){
            
            System.out.println("Your value at "+(i+1)+" index");
            System.out.println("The itration will repeat "+count+"times" );        

        }
        
       count++; 
    }
    
 }    
 
    }
public class ArrayTask {
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
               System.out.println("Enter row");
        int row = scan.nextInt();
        System.out.println("Enter colomn");
        int col = scan.nextInt();
    Array a = new Array(row, col);
    int [][] Number = new int [row][col];
    int [] num = new int [row*col];
    a.insert(Number, row, col);
    a.conver(Number, num);
    System.out.println("Enter target number ");
    int target = scan.nextInt();
     a.search(num,target );
     scan.close();
}

}
