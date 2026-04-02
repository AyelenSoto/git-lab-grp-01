package pe.edu.tecsup.lab;

import java.util.List;

public class StudentReport {

    public void generateReport(List<String> students) {
        System.out.println("   Reporte de los estudiantes: ");
        
        for (String student : students) {
            System.out.println("Estudiante registrado: " + student);
        }
      
        System.out.println("Total de alumnos procesados: " + students.size());
        System.out.println("Reporte generado exitosamente¡");
    }
}
//Modificacion importante