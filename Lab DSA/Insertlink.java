import java.util.Arrays;
import java.util.Scanner;

import javax.management.openmbean.SimpleType;

class Node{
int data;
Node next;
Node(int data){
this.data=data;
}
Node(int data , Node next){
 this.data=data;
 this.next=next;   
}
} 
public class Insertlink {
    public static void sum(Node start) {
    int sum = 0;
    int count = 0;
    for (Node p = start; p!=null; p=p.next) {
            sum+=p.data;
            count++;
         }
         System.out.println("The sum of the node is "+ sum);
         System.out.println("The itration will move "+ count + " times");
         System.out.println("Avarage of the number is " + (float)(sum/count));
    }
    public static void main(String[] args) {
        Node start = new Node(4);
Node head = start;
Scanner sc = new Scanner(System.in);
System.out.println("Enter size of the link list ");
int size = sc.nextInt();
for (int i = 1; i < size; i++) {
    System.out.println("Enter " + i + "element ");
    int data = sc.nextInt();
    head.next = new Node(data);
    head=head.next;
}
sum(start);
// System.out.println(Arrays.sort(start));
    // for (Node p = start; p!=null; p=p.next) {
    //     System.out.println(p.data);
    // }
    }
}
