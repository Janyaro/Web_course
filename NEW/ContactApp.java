package NEW;

import java.util.Scanner;

class ContactApp{
    Scanner sc = new Scanner(System.in);
    int size;
 String[] con = new String [size];
 String[] delcon = new String [size-1];
    ContactApp(){
        // this.size=size;
    }
// add contact
 public void add(int size) {
    for (int i = 0; i < con.length; i++) {
        con[i]=sc.nextLine();
    }
}
// disply contact
public void disply(){
    for(int j=0;j<con.length;j++){
    System.out.println(con[j]);
    }
}

// search a contact
public void searchContact(String search) {
    for(int x=0;x<con.length;x++){
        if(con[x]==search){
            System.out.println(con[x]);
        }
        else {
            System.out.println("Number not found ");
        }
    }    
}

}
 
