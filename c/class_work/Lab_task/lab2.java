package c.class_work.Lab_task;


import java.util.Scanner;
public class lab2 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
   ContantApp c = new ContantApp();
   String [] number = {"443-966-9591","563-571-1996","210-510-2970","360-367-0724"};
do {
    System.out.println("1 :Disply number ");
    System.out.println("2 :Search number ");
    System.out.println("3 :Delete number ");
    System.out.println("4 :Add number ");
    System.out.println("5 :update number ");
    System.out.println("Enter above option ");
    int option = sc.nextInt();
    sc.nextLine();
    switch (option) {
        case 1:
            c.disply(number);
            break;
            case 2:
            System.out.println("Enter Search number ");
            // sc.nextLine();
            String search = sc.nextLine();
            c.Search(number, search);
            break;
            case 3:
            // sc.nextLine();
            System.out.println("Enter Delete number ");
            String delno= sc.nextLine();
            c.delete(delno, number);
            break;
            case 4:
            System.out.println("Enter index number ");
            int index = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter number ");
            String no = sc.nextLine();
            c.Add_Contant(index, option, no);
            break;
            case 5:
            
            System.out.println("Enter updated number  ");
            String cur_no=sc.nextLine();
            // sc.nextLine();
            System.out.println("Enter update number ");
            String up_no = sc.nextLine();
            c.update(cur_no, up_no, number);
            break;
        default:
            break;
    }
   
} while (true);   
}

}
