public class Main{
    public static class Person{
        int age;
        String name;
    
        public void print(){
            System.out.println(this.name + " - " + this.age);
        }
    }

    public static void swap(Person p1, Person p2) { // coppying the value of p1 and p2
        int tempAge = p1.age;
        p1.age = p2.age;
        p2.age = tempAge;

        String tempName = p1.name;
        p1.name = p2.name;
        p2.name = tempName;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 23;
        p1.name = "Amogh";
        
        Person p2 = new Person();
        p2.age = 24;
        p2.name = "Lakshay";

        swap(p1, p2);

        // Note: - Rightnow this function will  swap the value of p1 and p2 

        p1.print(); // OUTPUT: - Lakshay - 24
        p2.print(); // OUTPUT: - Amogh - 23
        
    }
}