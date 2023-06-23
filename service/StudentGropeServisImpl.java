package service;

import java.util.List;

import model.Student;
import model.StudentGrope;
import model.Teacher;

public interface StudentGropeServisImpl {

    public void createGrope(String numberGrope, Teacher teacher, List<Student> studentsList);

    

    public void readGrope();
}
