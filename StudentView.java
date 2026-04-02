package pe.edu.tecsup.lab;
import java.util.List;

public class StudentView {
    public void displayStudent(List<String> students) {
        System.out.println("--------- LISTADO DE ESTUDIANTES ---------");
        
        for (String student : students) {
            System.out.println(" > " + student);
        }
        
        System.out.println("------------------------------------------");
        System.out.println("Total de registros: " + students.size());
        System.out.println("------------------------------------------");
    }
}