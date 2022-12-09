import java.lang.String;
import java.util.Scanner;
public class Class_task1 {
public static void main(String[] args) { 
    Scanner sc  = new Scanner(System.in);
    String roll_no[]=new String [4];
    String  [] pp=new String [4];
    String    oop[]=new String  [4];
    System.out.println("Enter detail");
    for (int j = 0; j < oop.length; j++) {
        System.out.println("Enter roll number "+(j+1));
        roll_no[j]=sc.nextLine();
        System.out.println("Enter  pp marks "+(j+1));
        pp[j]=sc.nextLine();
        System.out.println("Enter oop marks  "+(j+1));
        oop[j]=sc.nextLine();
    }
    String [][] myclass = new String  [4][3];
    for (int i = 0; i < myclass.length; i++) {
        myclass[i][0]=roll_no[i];
        myclass[i][1]=pp[i];
        myclass[i][2]=(oop[i]);
    }
    System.out.println("The number of the matrix is ");
    for (int k = 0; k < 4; k++) {
        for (int l = 0; l < 3; l++) {
            System.out.print(myclass[k][l]+"  ");
        }
        System.out.println();
    }
sc.close();
 }   
}
