
public class Person {

//data members 
String name;
String family;
int age;
    Person (String name, String family, int age)
    {
        this.name = name;
        this.family = family;
        this.age = age;
        talk();

    }
    //method in which the person talks
    public void talk() {
        System.out.println("I am " +this.name+ " and my family members are " +this.family+ ". I am " +this.age+ " years old.");
    }
    //main method
    public static void main(String[] args) {

        Person person1 = new Person("john", "bob, larry, sara",20);

        
    }
}
