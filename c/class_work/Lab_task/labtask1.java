package c.class_work.Lab_task;

import java.util.Arrays;

class ContactApp{
 String [] number = {"443-966-9591","563-571-1996","210-510-2970","360-367-0724"};
 public void disply(String [] a) {
    for (String number: a) {
        System.out.println(number);
    }
 }
 public void Search(String [] number , String no) {
    for (int i=0;i<number.length;i++) {
        if(number[i]==no){
            System.out.println(number[i]);
            return;
        }
    }
    System.out.println("Number not found ");
 }


public void Add_Contant(String [] number , String no ) {
    String [] numbers = new String [number.length+1];
    //  for(int j=0;j<=number.length;j++){
    numbers[number.length+1]=no;     
    System.out.println(Arrays.toString(numbers));        
}} 




public class labtask1{
    public static void main(String[] args) {
        String [] number = {"443-966-9591","563-571-1996","210-510-2970","360-367-0724"};
        ContactApp c = new ContactApp();
        c.Add_Contant(number, "0344433");

    }
}