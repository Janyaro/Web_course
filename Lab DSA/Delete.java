import java.util.Scanner;

public class Delete {
    public static Node Deletevalue(Node start , int value) {
    if (start==null||start.data>value) {
        return start;
    }
    if (start.data==value) {
   return start.next;
    }
    for(Node p = start;p.next!=null;p=p.next){
        if(p.next.data>value){
          break;
        }
        if (p.next.data==value) {
            p.next=p.next.next;
            break;
        }
    }
    return start;
  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the linklist ");
        int size = sc.nextInt();
        System.out.println("Enter link list 1 data ");
        int val = sc.nextInt();
        Node start = new Node(val);
        Node q = start;
     for (int i = 2; i <= size; i++) {
        System.out.println("Enter link list"+ i +" data ");
        val = sc.nextInt();
        q.next = new Node(val);
        q=q.next;
     }       
     System.out.println("Enter deleted value ");
     int insert = sc.nextInt();
   Node disply =   Deletevalue(start, val);
   for(Node i = disply;i!=null;i=i.next){
    System.out.println(i.data);
}    
}
}
