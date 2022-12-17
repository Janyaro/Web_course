package c.class_work.Lab_task;

import java.util.Scanner;

public class labtask2 {
    public static void main(String[] args) throws Exception {
        String [] song = {"falaktak","terahonelaga","hotwave","beintehaa1n"};
        Scanner sc = new Scanner(System.in);
        FireAir f = new FireAir();
        do {
         System.out.println("1 :Disply all song ");
         System.out.println("2 :Add new  song ");
         System.out.println("3 :Delete song ");
         System.out.println("4 :Search song ");
         System.out.println("5 :Update song ");   
         System.out.println("Enter above option ");
         int option = sc.nextInt();
         switch (option) {
            case 1:
                f.disply(song);
                break;
                case 2:

                System.out.println("Enter song name");
                String songname = sc.nextLine();
                sc.nextLine();

            System.out.println("Enter position");
            int position = sc.nextInt();
            
                f.Add_Song(songname, song, position);
                break;
                case 3:
                System.out.println("Enter delete song index");
                int index = sc.nextInt();
                f.delname(index, song);
                break;
                case 4:
                System.out.println("Enter song name");
                
                String sname = sc.nextLine();
                sc.nextLine();
                f.search_Song(sname, song);
                break;
                case 5:
                System.out.println("Enter current song index");
                int in = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter new song name ");
                String updatename = sc.nextLine();
                f.update(in, updatename, song);
                break;
         
            default:
            System.out.println("Option doesnot available ");
                break;
         }
        } while (true);
    }
}
