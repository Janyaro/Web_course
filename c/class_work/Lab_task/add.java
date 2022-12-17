package c.class_work.Lab_task;

import java.util.Scanner;

public class add {
   public static void main(String[] args) {

String n[] = {"ddd3","3423234","323242","43434"};
String no [] = new String [n.length+1];
Scanner sc = new Scanner(System.in);
int index = sc.nextInt();
sc.nextLine();
System.out.println("Enter nummber");
String num =sc.nextLine();
       //  for(int j=0;j<=number.length;j++){
       for (int i = 0; i < n.length; i++) {
      if(i<index){
        no[i]=n[i];
      }
      if(i==index){
    no[i]=num;
      }
      else{                       // 2,2,3,45,0                         // 3,2,3,5,45,0
        no[i+1]=n[i];
      }
   }
for (int j=0;j<no.length-1;j++) {
    System.out.println(no[j]);
}
}
 } 

