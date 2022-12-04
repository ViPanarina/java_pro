package first;
public class Person {

    public String fullName;
    public int age;

    public void talk(){
        System.out.println("Говорит " + this.fullName);
    }
    public void move(){
        System.out.println("Говорит " + this.fullName);
    }


    public Person(){
    }

    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }



}
