package service;

import java.util.List;

import model.Student;
import model.Teacher;

public interface DataServiceImpl {
    public void create(List<Student> students, Teacher teacher);

    public void create(Student inpuStudent);

    public void read();
}
