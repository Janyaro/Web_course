package c.class_work;

import java.util.Arrays;
import java.util.Scanner;

public class Mid_Question {
public static void search(int [] arr , int target) {
     int count = 0;
     for(int m=0;m<arr.length;m++){
        count++;
     if (arr[m]==target){
        System.out.println("The value at index "+ m);
        return;
    }
     }
     System.out.println("The counter will run "+count+"times");
     }


    public static void main(String[] args) {
        int[][] marks = new int[4][3];
        int col = 4*3;
        int[] One_d = new int[col];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter " + (i + 1) + " row element");
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextInt();
            }
        }


         col=0;
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 3; y++) {
                One_d[col] = marks[x][y];
            col++;

            }
        }
        
        Arrays.sort(One_d);
System.out.println("The first Dimension Array will be ");        
        for (int s = 0; s <One_d.length; s++) {
            System.out.print(One_d[s] +"  " );
        
          }
          System.out.println();
          search(One_d, 4) ;
    }
 
        }    
