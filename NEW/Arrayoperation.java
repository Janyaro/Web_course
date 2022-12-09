package NEW;

import java.util.Scanner;

class Arrayoperation {
    
    Scanner sc = new Scanner(System.in);
    int  size;
    int [] num  = {1223,333,44,55,33,22};    
    int [] num1  = new int [size-1]; 
Arrayoperation (int size){
this.size=size;
}

    // public  void arrayInput(int size){

    //     int [] num  = new int [size];    
    // for (int i = 0; i < size; i++) {
    //         System.out.println("Enter "+(i+1)+" element ");
    //         num[i]=sc.nextInt();
    //     }
    // }

    public void ArrayOutput() {
        for (int j = 0; j < num.length; j++) {
            System.out.println(num[j]);
        }
    }
public void delete(int number) {
    for (int y = 0; y < num.length; y++) {
      if(num[y]==number){//1,2,4,5
        continue;          //
      }  
      else {    num1[y]=num[y];
      
    }
}
}}