public class StudentExample {
    int id ;
    String name;
    Student(){
        this(101, "Ritik");
        System.out.println("Default Constructor Called");
    }
    Student(int id, String name){
        this.id = id;
        this.name = name;
        System.out.println("Parameterised Constuctor Called");
    }
    void display(){
        System.out.println(id + " " + name);
    }
    public static void main(String[] args){
        Student s = new Student();
        s.display();
    }
}