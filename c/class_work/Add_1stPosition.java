
public class Add_1stPosition {
Node head;
    class Node {
        String data;
        Node next;
        Node(){
    
        }
        Node(String data){
            this.data=data;
          this.next=null;
        }
    
    }
    
    public  void position(String data) {
        Node new_Node = new Node(data);
        if (head==null) {
            head=new_Node;
            return;
        }
        new_Node.next=head;
        head=new_Node;
        
    
    } 
    public void disply(){
        for(Node dis=head;dis!=null;dis=dis.next){
            System.out.println(dis.data);
        }
    }   
    public static void main(String[] args) {
    Add_1stPosition list = new Add_1stPosition();
    list.position("eass");
    list.position("easee'");
    list.disply();
}
}
