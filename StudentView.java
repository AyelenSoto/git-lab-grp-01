package pe.edu.tecsup.lab;
import java.util.List;

public class StudentView {
    public void displayStudent(List<String> students) {
        System.out.println("LISTADO DE ESTUDIANTES");
        for (String student : students) {
            System.out.println("Estudiante: " + student);
        }
        System.out.println("Total: " + students.size());
    }
}