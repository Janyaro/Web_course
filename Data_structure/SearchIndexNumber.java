package Data_structure;

import java.util.Scanner;

public class SearchIndexNumber {
    public static void main(String[] args) {
        Scanner  scan= new Scanner(System.in);
        int [] number = {2,4,6,84,3,5};
        System.out.println("Enter target  number ");
        int num = scan.nextInt();
        for (int i = 0; i < number.length; i++) {
            if(number[i]==num){
                System.out.println(i+1);
                return;
            }
        }
        System.out.println("Number not Found ");
        scan.close();
    }
}
