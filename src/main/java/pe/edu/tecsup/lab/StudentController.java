package pe.edu.tecsup.lab;

import java.util.ArrayList;
import java.util.List;

public class StudentController {

    public List<String> getStudents() {

        // Lógica agregada
        List<String> students = new ArrayList<>();

        students.add("Ayelén Soto");
        students.add("Willy Torres");
        students.add("Katherine Quispe"); 
        students.add("Alexandra Robles");

        return students;
    }
}