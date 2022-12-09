import java.util.Scanner;

public class DeleteValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = scan.nextInt();
        int [] a = new int [n];
        int [] b = new int [n-1];
        System.out.println("Enter array values at index  ");
        for(int i=0;i<a.length;i++){//1,2,6,
            
            a[i]=scan.nextInt();
        }
        System.out.println("Enter the delete value index ");
        int p = scan.nextInt() ;
        // System.out.println("Enter the putting value index ");
        // int  value = scan.nextInt() ;
        for (int k = 0; k < a.length; k++) {
            if(k<p){
            b[k]=a[k];
            }
            else if(k==p){
                // b[k]=value;
           continue;
                        }
                        else {
                            b[k-1]=a[k];
                        }
            
        } 
        System.out.println("The value of the arrays are ");
        try {
            for (int j=0;j<a.length-1;j++) {
            
                System.out.println(b[j]);            
            }     
        } catch (Exception e) {
            // TODO: handle exception
        }
       

scan.close();
    }
    
}
