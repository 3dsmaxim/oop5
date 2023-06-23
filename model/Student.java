package model;

public class Student extends User {
    static Integer idGenerator = 0;
    Integer studentID;


  
    public Student(String name, Integer bornYear) {
        super(name, bornYear);
        this.studentID = idGenerator++;
    }
    @Override
    public String toString() {
        
        return studentID + " " + super.toString();
    }
}
