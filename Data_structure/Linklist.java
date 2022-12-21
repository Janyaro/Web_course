import java.util.Scanner;

import javax.management.openmbean.SimpleType;

class Node {
    int data ;
   Node next ;
   Node(int data ){
    this.data=data;
   }
   Node(int data , Node next){
    this.data=data;
    this.next=next;
} 
}

public class Linklist{
    public static void addlist (Node start , int num) {
        while (start==null) {
        start=new Node(num);
      }
      Node p = start;
      while (p.next!=null) {
          p.next = new Node(num);
        p=p.next;    
    }}
    // public static void Addnumber(Node start , int value) {
    //    Node q = start;
    //     while (q.next!=null) {
    //         if(q.next.data>value){break;}
    //     }
        
    //     q.next = new Node(value, q.next);
        
    // }
    public static void main(String[] args) {
        Node start = new Node(12);
 addlist(start, 17);
 addlist(start, 40);
 
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
    //     Node p = start;
    //    p.next= new Node(15);
    //    p.next.next = new Node(19);
    //    Addnumber(start, 55);
        // for (int i = 2; i <= size; i++) {
        //     System.out.println("Enter " + (i) + "value");
        //     int value = sc.nextInt();
        //     p.next= new Node(value);
        //     p=p.next;
        // }


        System.out.println("The value of the link list is");
        for(Node i = start;i!=null;i=i.next){
            System.out.println(i.data);
        }
    }
}