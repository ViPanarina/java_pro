package abstractclasses;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Teacher extends Human implements Teachable, Playable{

    public Teacher(String name, int id) {
        super(name, id);
        //teacher  fields init
    }


    /* @Override
     public String getName() {
         return  "Teacher" + super.getName();
     }*/
    @Override
    public void introduceYourself() {
        System.out.println("I'ma teacher!");
    }

    @Override
    public void teach(Student student , Subject  subject) {
        System.out.println("Teacher " + this.getName() + " teaches student " + student.getName());
        student.set.add(subject);
    }


    @Override
    public void teach(List<Student> students, Subject subject) {
        for (Student student: students){
            this.teach(student,subject);
        }

    }

    @Override
    public void play() {
        System.out.println("I play chess!");
    }
}
