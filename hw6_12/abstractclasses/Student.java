package abstractclasses;

import java.util.HashSet;
import java.util.Set;

public class Student extends Human implements Playable{


   // Subject[] learnedSubjects = new Subject[4];

    public Set<Subject> set = new HashSet<>();



    public Student(String name, int id) {
        super(name, id);
    }


    @Override
    public void introduceYourself() {
        System.out.println("I'm " + this.getName()+ " And I know "+ this.set.toString());
    }

    @Override
    public void play() {
        System.out.println("I am playing football!");
    }
}
