
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

        //initialize person1
        int p1age = 20;
        String p1name = "john"; 
        String p1family ="sarah, ron, bob";

        Person person1 = new Person(p1name, p1family,p1age);

        
    }
}
