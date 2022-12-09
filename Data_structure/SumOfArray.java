package Data_structure;
public class SumOfArray {
    
static int [] arr= {1,3,4,5,6};
public static int  sum(int [] arr) {
int sum=0;
for (int i = 0; i < arr.length; i++) 
    sum+=arr[i];
    return sum;


}
    public static void main(String[] args) {
        int [] number = {1,3,4,6,8};
        int counter=0;
    int sum=0;
        for (int i = 0; i < number.length; i++) 
       {
        sum=sum+number[i];       
counter++;}
System.out.println("The itrative will repite "+counter+" times ");
System.out.println("The sum of the numbers is "+sum);
// System.out.println( sum(arr));
}
}
