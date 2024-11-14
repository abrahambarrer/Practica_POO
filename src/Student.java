public class Student {
    public String name;
    public int id;
    public int age;
    public String gender;

    public Student(String name, int id, int age, String gender) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

    @Override
    public String toString() {
        return String.format("Edad: %d", age);
    }
}
