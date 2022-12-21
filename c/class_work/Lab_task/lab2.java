package c.class_work.Lab_task;


import java.util.Scanner;
public class lab2 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
   Contact_App c = new Contact_App();

   
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

class contact_App{
    String [][] num;
    String [] number = {"443-966-9591","563-571-1996","210-510-2970","360-367-0724"};
   String [] name = {"waseem","rizwan","saim","umair"};
   String [][] contactApp = new contactApp [number.length][name.length];
      contact_App(String [][] num){
        this.contactApp=num;
    }
    public void convertTwo(String []number , String [] name , String [][] contactApp) {
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < name.length; j++) {
                contactApp[i][0]=number[i];
                contactApp[i][1]=name[j];
            }
    }}
    public void disply() {
     for (int i = 0; i < contactApp.length; i++) {
        for (int j = 0; j < 2; j++) {
            System.out.print(contactApp[i][j] + "  ");
        }
        System.out.println();
     }   
    }
}