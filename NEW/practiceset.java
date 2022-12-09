package NEW ;

import java.util.Scanner;

public class practiceset{
public static void main(String[] args) {
int [][] marks = new int [3][2];
Scanner sc = new Scanner(System.in);
System.out.println("Enter numbers ");
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 2; j++) {
marks[i][j]=sc.nextInt();        
    }

}
for(int k=0;k<3;k++){
    for (int l = 0; l < 2; l++) {
        System.out.print(marks[k][l]+" ");
    }
    System.out.println();
}
sc.close();
}
}