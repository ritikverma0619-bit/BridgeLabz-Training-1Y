public class ConstructerDemo {
    int id;
    String name;
    int age;

    public ConstructerDemo(){
        System.out.println("Default Constructer");
    }
    public ConstructerDemo(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    public static void main (String[] args){
        ConstructerDemo cd = new ConstructerDemo();
        ConstructerDemo cdd = new ConstructerDemo(1,"Ritik", 19);
        cdd.display();
    }
}