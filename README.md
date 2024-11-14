[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/k4oLAzaP)
# Práctica (parcial). Arreglo de objetos

Considere las dos clases siguientes y sus descripciones. Dibuje el diagrama UML e implemente/codifique en Java

## Clase: Student
### Atributos: 
* name: Nombre del estudiante
* Id: Identificación escolar del estudiante
* age: Edad del estudiante
* gender: Género (masculino o femenino) del estudiante 

### Métodos: 
* Student(name: String, id: int, age:int, gender:String): constructor 
* getId(): Este método devuelve el ID del estudiante 
* getName(): Este método devuelve el nombre del estudiante 
* getAge(): Este método devuelve la edad del estudiante 
* getGender(): Este método devuelve el género del estudiante 
* display(): Este método muestra los atributos de la clase. 

## Clase: Section 
### Atributos: 
* arrayStu: Matriz de los estudiantes
* numStu: Número actual de estudiantes en la sección 

### Métodos: 
* Section(size:int): constructor
* addStudent(st:Student): Este método añade un estudiante st en la sección. Este método mostrará un mensaje "Estudiante agregado" si el estudiante se agrega con éxito en la sección, de lo contrario, mostrará un mensaje "La sección de la EE está llena".
* searchMax(): Este método devuelve el objeto Student que tiene la edad máxima en la sección.
* searchMax(gender:String): Este método devuelve el objeto Student que tiene la edad máxima en la sección con el género gender .
* splitStudents(male:Student[], female:Student[]): Este método almacenará a todos los estudiantes masculinos de la sección en la matriz male[] y a todos los estudiantes femeninos de la sección en la matriz female[]. Este método también devolverá el número de estudiantes female en la sección. 

