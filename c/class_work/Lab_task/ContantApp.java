package c.class_work.Lab_task;

public class ContantApp {
// Add contact 
    public void Add_Contant(String [] number  ,  int index , String no) {
        String[] addno = new String [number.length+1];
        //  for(int j=0;j<=number.length;j++){
        for (int i = 0; i < number.length+1; i++) {
         if(i<index){
             addno[i]=number[i];
           }
           if(i==index){
         addno[i]=no;
           }
           else{                       // 2,2,3,45,0                         // 3,2,3,5,45,0
             addno[i+1]=number[i];
           }
        }
 for(int j=0;j<addno.length;j++){
     System.out.println(addno[j]);
 }    
 }   

// disply all contact
 public void disply(String [] a) {
    for (String number: a) {
        System.out.println(number);
    }
 }
 // Search number 
 public void Search(String [] number , String no) {
    for (int i=0;i<number.length;i++) {
        if(number[i].equalsIgnoreCase(no)){
            System.out.println("Your number at index "+ i);
            return;
        
        }
    }
    System.out.println("Number not found ");
 }
// update the  contant s
public void update(String current_number, String updatenum ,String [] a) {
    for(int p=0;p<a.length;p++){
        if(a[p].equals(current_number)){
            a[p]=updatenum;

        }
    }
  for(int g=0;g<a.length;g++){
    System.out.println(a[g]);
  }
}

public void delete (String number , String [] no) {
    String delno [] = new String [no.length-1];
    for (int k= 0; k < delno.length; k++) {
        if(no[k].equals(number))  {
        no[k]=no[k+1];
        }    

    }
    for(int u=0;u<no.length-1;u++){
        System.out.println(delno[u]);
    }     
}

}
