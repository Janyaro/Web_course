class person {
String name ;
person(String name){
this.name=name;
System.out.println(name);
}
}
class man {
int age ;
man(int age){
    this.age=age;
    System.out.println(age);
}
}

public class exaple {
    public static void main(String[] args) {
        person [] p= new person[3];
        person p1 = new person("waseem ");
        person p2 = new person("waseem ");
        // person p3 = new person("waseem ");
        p[0]=p1;
        man [] m = new man[3];
        man m1 = new man(2);
        // man m2 = new man(4);
        // man m3 =new man(4);
        m[0]=m1;
        p[1]=p2;    }
    
}
