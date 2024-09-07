
package student2;

public class Student2 {
    int id;
    String name;
    
    void display () { System.out.println(this.id + " " + this.name); }
    
    public static void main(String[] args) {
        Student2 stu = new Student2();
        Student2 stu2 = new Student2();
        stu.display();
        stu2.display();
    }
    
}
