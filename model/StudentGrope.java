package model;

import java.util.List;

public class StudentGrope {
    protected String numberGrope;
    Teacher teacher;
    List<Student> studentsList;

    public StudentGrope(String numberGrope, Teacher teacher, List<Student> studentsList) {
        this.numberGrope = numberGrope;
        this.teacher = teacher;
        this.studentsList = studentsList;
    }

    public String getNumberGrope() {
        return numberGrope;
    }

    public void setNumberGrope(String numberGrope) {
        this.numberGrope = numberGrope;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }
    
}

  
