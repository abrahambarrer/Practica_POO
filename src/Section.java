import java.util.Scanner;

public class Section {
    public int numStu;
    public Student[] arrayStu;

    public Section(int size) {
        arrayStu = new Student[size];
        numStu = 0;
    }

    public void addStudent(){
        if (numStu < arrayStu.length){
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese id: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.print("Ingrese edad: ");
            int edad = Integer.parseInt(sc.nextLine());
            System.out.print("Ingrese genero: ");
            String genero = sc.nextLine();
            arrayStu[numStu] = new Student(nombre, id, edad, genero);
            numStu++;
            System.out.println("Estudiante agregado");
        }
        else
            System.out.println("La seccion de la EE esta llena");
    }

    public Student searchMax(){
        Student max = this.arrayStu[0];
        for (Student s : this.arrayStu) {
            if (s.getAge() < max.getAge())
                max = s;
        }
        return max;
    }

    public int searchMax(String gender){
        Student max = this.arrayStu[0];
        for (Student s : this.arrayStu) {
            if (max.getAge() < s.getAge() && s.getGender().equals(gender)){
                max = s;
            }
        }
        if (max.getGender().equals(gender))
            return max.getAge();
        else
            return -1; // No hay estudiantes femeninos
    }

    public int splitStudents(Student[] male, Student[] female){
        int i = 0;
        int j = 0;
        for (Student s : arrayStu) {
            if (s.getGender().equals("Female")){
                female[i] = s;
                i++;
            }
            else{
                male[j] = s;
                j++;
            }
        }
        return i;
    }
}
