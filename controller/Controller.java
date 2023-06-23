package controller;

import java.util.List;

import model.Student;
import model.Teacher;
import service.DataService;
import service.StudentGropeServis;

public class Controller extends DataService {
    DataService dataService = new DataService();

    public void create(List<Student> inpuStudent, Teacher teacher) {
        if (inpuStudent != null && teacher != null) {

            dataService.create(inpuStudent, teacher);
        } else {
            System.out.println("Wrong data!");
        }

    }
    public void create(Student inpuStudent) {
       dataService.create(inpuStudent);
       
    }

    public void read() {
        dataService.read();

    }

    StudentGropeServis studentGropeServis = new StudentGropeServis();
