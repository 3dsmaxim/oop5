package service;

import java.util.ArrayList;
import java.util.List;

import model.Student;
import model.Teacher;

public class DataService implements DataServiceImpl {
    static Integer idGenerator = 1;
    Integer id;

    
    List<Student> studentsList;
    Teacher teacher;
    
    public DataService() {
        this.studentsList = new ArrayList<>();
        this.id = idGenerator++;
        
    }

    @Override
    public void create(List<Student> inpuStudent, Teacher teacher) {
        studentsList.addAll(inpuStudent);
        this.teacher = teacher;
    }

    @Override
    public void read() {
        System.out.println("grope №"  + this.id );
        System.out.println(teacher);
        for (Student s : studentsList) {
            System.out.println("\t" + s);

        }
    }

    @Override
    public void create(Student student) {
        this.studentsList.add(student);
    }
     
    
}
