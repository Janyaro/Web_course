class A {
int age;
String name;
A(int age ,String name){
    this.name=name;
    this.age=age;
    System.out.println(name +" "+age);
}
}
class B extends A{
    int color;
B(int age,String name,int color){
    super(age, name);
    this.color=color;
}
}
public class classTask2 {
    public static void main(String[] args) {
        A[] car= new A[4];
        B[] bike= new B[4];
    A a1 = new A(2, "waseem")  ;
    B b1 = new B(2,"mohsin", 77);
    car[0]=a1;
    //pass super class derived class object
    car[1]=b1;
    bike [0] = b1;
    // Syst=em.out.println(car);
    // pass derived class super class object  
        // bike[0]=a1;//error occcur int this statement
        // car.getClass();
        System.out.println(car.getClass());
    }
}
