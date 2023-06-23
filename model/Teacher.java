package model;

public class Teacher extends User {
    static Integer idGenerator = 0;
    private Disciples discriplesTaught;

    private int idTeacer;
    public Teacher(String name, Integer bornYear, Disciples disciples) {
        super(name, bornYear);
        this.discriplesTaught = disciples;
        this.idTeacer = idGenerator++;
    }

    public Disciples getDiscriplesTaught() {
        return discriplesTaught;
    }
    @Override
    public String toString() {
        
        return "teacer " + idTeacer + " " + discriplesTaught + super.toString(); 
    }
  
}
