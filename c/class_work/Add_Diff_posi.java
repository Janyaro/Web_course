

class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Add_Diff_posi {
    static Node head;
    private static void add_number(int data) {
        Node Current = new Node(data);
        if (head==null) {
            head=Current;
            return;
        }
        Current.next=head;
        head=Current;

    }
    public static void add_last(int data) {
        Node Last = new Node(data);
        Node l = head;
        if(head==null){
            head=Last;
      return;
        }
        
        while(l.next!=null){
            l=l.next;
            // l=l.next;
        }
        l.next=Last;
    }
    public static void main(String[] args) {
     System.out.println("Enter value ");
     add_number(3);
     add_number(120);
     add_number(23);
    add_last(34);
    add_last(783);
     for  ( Node p= head; p!=null; p=p.next) {
        System.out.println(p.data);
     }
    }
}
