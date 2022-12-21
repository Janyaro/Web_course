
import java.util.Scanner;

class App {
    int size;
    String[][] AppCon = new String[size][2];

    App(int size, String[][] AppCon) {
        this.size = size;
        this.AppCon = AppCon;

    }

    public void Disply() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(AppCon[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    // search
    public void Search(String searchindex) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 2; j++) {
                if (AppCon[i][j].equals(searchindex)) {
                    System.out.println(" given position of the number is " + (i + 1));
                    return;
                }

            }
        }
        System.out.println("Number is not available in the contact list ");
    }

    // delete

    public void Delete(String delete) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 2; j++) {
                if (AppCon[i][j].equals(delete)) {
                    AppCon[i][0] = null;
                    AppCon[i][1] = null;
                    System.out.println("Deletion is successfull");
                    return;
                }

            }

        }
        System.out.println("Number not found");
    }

    // update

    public void Update(String upnum) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 2; j++) {
                if (AppCon[i][j].equals(upnum)) {
                    System.out.print("Enter name");
                    String newname = scan.nextLine();
                    System.out.print("Enter number");
                    String newnumber = scan.nextLine();
                    AppCon[i][0] = newname;
                    AppCon[i][1] = newnumber;
                    System.out.println("Updation is successfull ");
                    return;
                }

            }
        }
        System.out.println("Number not fount ");
        scan.close();
    }

    // addd number list

    public void addNumber(int position) {
        int nsize = size+1;
        Scanner scan = new Scanner(System.in);
        String newConta[][] = new String[nsize][2];
        for (int i = 0; i < nsize; i++) {
            

                if (i < position) {
                    newConta[i][0] = AppCon[i][0];
                    newConta[i][1] = AppCon[i][1];
                } else if (i == position) {
                    System.out.print("Enter name");
                    String n = scan.nextLine();

                    System.out.print("Enter number");
                    String nu = scan.nextLine();
                    newConta[i][0] = n;
                    newConta[i][0] = nu;
                } else {
                    newConta[i][0] = AppCon[i-1][0];
                    newConta[i][1] = AppCon[i-1][1];
                }
            
        }
        for (int l = 0;  l < newConta.length;  l++) {
            for (int m = 0; m <2; m++) {
                System.out.print(newConta[l][m]);
            }
            System.out.println();
        }
    }
}

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of the contact App");
        int size = sc.nextInt();
        sc.nextLine();
        String cApp[][] = new String[size][2];
        for (int i = 0; i < size; i++) {

            System.out.println("Enter name");
            String name = sc.nextLine();

            System.out.println("Enter contact number");
            String number = sc.nextLine();
            cApp[i][0] = name;
            cApp[i][1] = number;

        }
        do {
            App a = new App(size, cApp);
            System.out.println("1 :Disply all number ");
            System.out.println("2 :Search number ");
            System.out.println("3 :Delete all number ");
            System.out.println("4 :Update all number ");
            System.out.println("5 :Add new number ");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    a.Disply();
                    break;
                case 2:
                    System.out.println("Enter search contact ");
                    String search = sc.nextLine();
                    a.Search(search);
                    break;
                case 3:
                    System.out.println("Enter search contact ");
                    String delete = sc.nextLine();
                    a.Delete(delete);
                    break;
                case 4:
                    System.out.println("Enter update contact ");
                    String update = sc.nextLine();
                    a.Update(update);
                    break;
                case 5:
                    System.out.println("Enter adding position");
                    int position = sc.nextInt();
                    a.addNumber(position);
                    break;
                default:

                    break;
            }

        } while (true);

    }
}
