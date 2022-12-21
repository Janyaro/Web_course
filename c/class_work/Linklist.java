import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
    public Node(int data2, Node next2) {
    }
}
public class Linklist {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Node start = new Node(10);
    int count = 0;
    Node p = start;
    System.out.println("Enter size of the link list ");
   int size = sc.nextInt();
   
   for (int j = 2; j <= size; j++) {
        p.next = new Node(j*11);
        p=p.next;
        count++;
    }

    for(Node i=start;i.next!=null;i=i.next){
System.out.println(i.data);
    }
   } 
}
