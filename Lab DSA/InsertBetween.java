import java.net.SocketTimeoutException;
import java.util.Scanner;

public class InsertBetween {
    public static void Between(Node start, int target) {
        Node current = start;
        while (current.next != null) {
            if (target < current.next.data) {
                break;
            }
            current = current.next;
        }

        current.next = new Node(target, current.next);
    }
public static void disply(Node start) {
    System.out.println("The elemeent of the link list is ");
     for (Node p = start; p != null; p = p.next) {
         System.out.println(p.data);
    }    
}
    // add data in the start 
    public static void  StartValue (Node start , int value ){
        if (start==null||start.data>value) 
         start= new Node(value, start);
       disply(start);
       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node start = new Node(12);
        Node head = start;
        System.out.println("Enter size of the link list ");
        int size = sc.nextInt();
        for (int i = 2; i <= size; i++) {
            System.out.println("Enter data of the linklist");
            int data = sc.nextInt();
            head.next = new Node(data);
            head = head.next;
        }
        System.out.println("Enter indrted value ");
        int value = sc.nextInt();
        StartValue(start, value);
        // Between(start, value);
        // System.out.println("The elemeent of the link list is ");
        // for (Node p = start; p != null; p = p.next) {
        //     System.out.println(p.data);
        // }
    }
}
