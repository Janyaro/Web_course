import java.util.List;
import java.util.Scanner;

public class Bubble {
    public static void disply(int [] number) {
        for (int i : number) {
            System.out.print(i +"  ");
        }

    }
    public static void bubble_sort(int [] number) {
        for (int i = 0; i < number.length-2; i++) {
            for (int j = 0; j < number.length-1-i; j++) {
                int temp ;
                if(number[j]>number[j+1]){
                    temp=number[j+1];
                    number[j+1]=number[j];
                    number[j]=temp;

                }

            }
        }
        disply(number);
        // for (int i : number) {
        //     System.out.print(i +",");
        // }
    }

    public static void insertion(int []number) {
        for (int i = 1; i < number.length; i++) {
            int current = number[i];
            int j=i-1;
            while (j>=0&&number[j]>current) {
                number[j+1]=number[j];
                j=j-1;
            }
            number[j+1]=current;
        }
        disply(number);
    }
    public static void Selection(int [] number) {
        for (int i = 0; i < number.length-1; i++) {
            int minindex = i;
            for (int j = i+1; j < number.length; j++) 
                if(number[j]<number[minindex])
                    minindex=j;
                
                int temp = number[i];
                number[i]=number[minindex];
                number[minindex]=temp;
            }
            disply(number);
        }
        
            
        public static int  partition(int number[],int began ,int end) {
        int p =number[began];    
        int i = began+1; //lm
        int j = end , temp;   // rm
       do{
        while (number[j]>p) {
            j--;
            while (number[i]<=p&&i<end) {
                i++;
                if(i<j){
                     temp = number[j];
                    number[j]=number[i];
                    number[i]=temp;
                }}
            }
        }    while(i<j);
        number[began]=number[j];
        number[j]=p;
        return j; 
    }
    public static void Quicksort(int [] number ,int began ,int end ) {
        
        int p ;
        if (began<end) {
            p=partition(number,began,end);
            Quicksort(number, began, p-1);
            Quicksort(number, p+1, end);

        }
  disply(number);
    }
    public static void main(String[] args) {
        int [] number = {1,39,8,2,6};
        //  bubble_sort(number);
        Scanner sc = new Scanner(System.in);
   System.out.println("1 :Bubble");
   System.out.println("2 :insert");
   System.out.println("3 :selection");
   System.out.println("4 :quick");
   int option = sc.nextInt();
   switch (option) {
    case 1:
        // bubble_sort(number);
        long b1 = System.nanoTime();
        bubble_sort(number); 
        long b2 = System.nanoTime();
        System.out.println();
        System.out.println("Time " +(b2-b1) );


        break;
    case 2:
   insertion(number);     
        break;

        case 3:
        Selection(number);        
        break;

        case 4:
   Quicksort(number, 0, 4); 
        break;
   
    default:
        break;
   }
        
}
}
