import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import controller.Controller;
import model.Disciples;
import model.Student;
import model.Teacher;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        Teacher teacher = new Teacher("Vat", 1968, Disciples.PROGRAMMING);
        
        Student katya = new Student("Katya ADSDAS", 1984);
        Student vasya = new Student("Vasya czccd", 1985);
        Student tik = new Student("Tik AdsfAS", 1983);
        List<Student> list = new ArrayList<>(Arrays.asList(katya, vasya, tik));

        

    
        controller.create(list, teacher);
        controller.read();

    }
}