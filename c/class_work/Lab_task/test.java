import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        String [] d = {"falaktak","terahonelaga","hotwave","beintehaan"};
        Scanner sc = new Scanner(System.in);
System.out.println("Enter name");
String name =sc.nextLine();
System.out.println("Enter up name ");
String updateSong = sc.nextLine();
    //     for (int k = 0; k < d.length; k++) 
    //     if(d[k].equals(name))
    // System.out.println("The given song is at index "+ (k+1));
         
    for (int x = 0; x < d.length; x++) {
        if(d[x].equalsIgnoreCase(name)){
            d[x]=updateSong;
        }
    }
    
    for(int y=0;y<d.length;y++){
        System.out.println(d[y]);
    }
    
//        String []uplist = new String [d.length-1];
//       System.out.println("Enter position ");
//       int num =sc.nextInt();
//         for(int b=0;b<d.length;b++){
//             if (b<num) {
//                 uplist[b]=d[b];
//             }
//            else if(b==num){
//             continue;
//            }
//             else 
//                 uplist[b-1]=d[b];            }
        
// for (int i = 0; i <d.length-1; i++) {
//     System.out.println(uplist[i]);
// }

    // System.out.println("Eter position");
    // int position= sc.nextInt();
    // sc.nextLine();
    // System.out.println("Enter song");
    // String songname = sc.nextLine();
    //         String playlist [] = new String [d.length+1];
    //            for (int i = 0; i < d.length; i++) {
    //                if(i<position){
    //                    playlist[i]=d[i];
    //                }
    //                if(i==position){
    //                    playlist[i]=songname;
    //                }
    //                else
    //                    playlist[i+1]=d[i];
                   
    //            }
               
    //            for (String li : playlist) {
    //                System.out.println(li);
    //            }
           }
       
    }

