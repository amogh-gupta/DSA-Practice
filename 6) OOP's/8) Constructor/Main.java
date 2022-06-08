// Constructor: - Default Constructor, Parametrized Constructor
public class Main {
    public static class Person{
        int age;
        String name;
        Person(){ // Default construtor
            age = 1;
            name = "-";
        }

        Person(int age, String name){ // Parametrized constructor
            this.age = age;
            this.name = name;
        }

        void print(){
            System.out.println(this.name +" "+ this.age);
        }
    }
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person(23, "Amogh");
        p1.print();
        p2.print();

    }    

}
