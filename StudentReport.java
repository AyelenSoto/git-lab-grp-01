package pe.edu.tecsup.lab;

import java.util.List;

public class StudentReport {

    // Este método recibe la lista de nombres que creó tu responsable
    public void generateReport(List<String> students) {
        System.out.println("   Reporte de los estudiantes: ");
        
        // Recorremos la lista para imprimir cada nombre
        for (String student : students) {
            System.out.println("Estudiante registrado: " + student);
        }
      
        System.out.println("Total de alumnos procesados: " + students.size());
        System.out.println("Reporte generado exitosamente¡");
    }
}