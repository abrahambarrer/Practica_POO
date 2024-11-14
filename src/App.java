public class App {
    public static void main(String[] args) throws Exception {
        Section seccion = new Section(4);
        seccion.addStudent();
        seccion.addStudent();
        seccion.addStudent();
        seccion.addStudent();
        System.out.println("Edad maxima general: " + seccion.searchMax());
        System.out.println("Edad maxima masculino: " + seccion.searchMax("Male"));
        Student[] male = new Student[2];
        Student[] female = new Student[2];
        System.out.println("Numero de estudiantes femeninos: " + seccion.splitStudents(male, female));
    }
}
