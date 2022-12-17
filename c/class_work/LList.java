import java.util.Scanner;

import javax.xml.validation.Schema;

class Node 
{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class LList {

    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the element");
        int size = sc.nextInt();
        System.out.println("Enter 1 element data");
            int data1 = sc.nextInt();
        Node head = new  Node(data1);
        Node p = head;
        for (int i = 2; i <= size; i++) {
            System.out.println("Enter "+i+ " element data");
             data1 = sc.nextInt();
             p.next = new Node(data1);
             p = p.next;
        }
        System.out.println("The element of the node is ");
     for(Node current=head;current!=null;current=current.next ){
        System.out.println(current.data);
     }
     
       
    }
}
