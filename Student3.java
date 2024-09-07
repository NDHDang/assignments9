
package student3;


public class Student3 {
    int id;
    int age;
    String name;

    Student3 (int i, String n) {
        this.id = i;
        this.name = n;
    }
    Student3 (int i, String n, int a) {
        this.id = i;
        this.name = n;
        this.age = a;
    }
    void display () { System.out.println(this.id + " " + this.name + " " + this.age);}
    public static void main(String[] args) {
        Student3 s1 = new Student3(111, "Karan");
        Student3 s2 = new Student3(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
    
}
