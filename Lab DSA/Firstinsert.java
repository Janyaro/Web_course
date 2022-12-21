import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Firstinsert {
    public static void insertion(Node start , int value ) {
        if(start==null || start.data>value){
            start = new Node(value, start);
        }
        Node p =start;
        while (p.next!=null) {
            if(p.next.data>value){break;}
            p = p.next;
        }
        p.next = new Node(value, p.next);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the linklist ");
        int size = sc.nextInt();
        System.out.println("Enter link list 1 data ");
        int val = sc.nextInt();
        Node start = new Node(val);
        Node p = start;
     for (int i = 2; i <= size; i++) {
        System.out.println("Enter link list"+ i +" data ");
        val = sc.nextInt();
        p.next = new Node(val);
        p=p.next;
     }       
     System.out.println("Enter inserted value ");
     int insert = sc.nextInt();
     insertion(start, insert);
     for(Node n = start ;n!=null;n=n.next ){
        System.out.println(n.data);
     }
    }

    
}
