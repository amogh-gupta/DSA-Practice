public class Main{
    public static class Person{
        int age;
        String name;
    
        public void print(){
            System.out.println(this.name + " - " + this.age);
        }
    }
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 23;
        p1.name = "Amogh";
        p1.print(); // OUTPUT : - Amogh - 23
    }
}