package service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import model.Student;
import model.StudentGrope;
import model.Teacher;

public class StudentGropeServis extends StudentGrope implements StudentGropeServisImpl {
    
    List<StudentGrope> studentGropes;
    public StudentGropeServis(String numberGrope, Teacher teacher, List<Student> studentsList) {
        super(numberGrope, teacher, studentsList);
        
    }


    



    @Override
    public void createGrope(String numberGrope, Teacher teacher, List<Student> studentsList) {
        
        studentGropes.add(numberGrope);
        studentGropes.addAll(teacher);
        studentGropes.addAll(studentsList);
        
    }

    @Override
    public void create(String studentGrop) {
          
    studentGropes.setNumberGrope(studentGrop);
    }
       

    @Override
    public void readGrope() {
        
        for (var s : studentGropes) {
            System.out.println("\t" + s);

        }
    }
    
    
}
