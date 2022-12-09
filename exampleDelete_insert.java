import java.util.Scanner;

public class exampleDelete_insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
String [] name = new String [4];
String [] updatename = new String [4-1];
for (int i = 0; i < name.length; i++) {
    name[i]=sc.nextLine();
}    
System.out.println("Enter the index number ");
int n= sc.nextInt();
for (int j = 0; j <name.length; j++) { // 1,35,6,77,5
    if(j<n){                                  // 1,6
        updatename[j]=name[j];
    }
    else if(j==n){
        continue;
    }
    else {
     updatename[j-1]=name[j];
    }
}
// System.out.println("Enter name");
// sc.nextLine();
// String in = sc.nextLine();
// for(int k=0;k<name.length;k++){ // 1,3,4,5,6
//     if(k<n){                    //1 ,3 8,
//         updatename[k]=name[k];
//     }
//     else if(k==n){
//         updatename[k]=in;
//     }
//     else {
//         updatename[k]=name[k-1];
// }}
    for (int k = 0; k < name.length-1; k++) {
        System.out.println(updatename[k]);
    }

    
    sc.close();
}}
